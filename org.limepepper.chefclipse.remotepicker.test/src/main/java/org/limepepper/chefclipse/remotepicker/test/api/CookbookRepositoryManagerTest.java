package org.limepepper.chefclipse.remotepicker.test.api;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.limepepper.chefclipse.remotepicker.api.CookbookRepositoryManager;
import org.limepepper.chefclipse.remotepicker.api.ICookbooksRepository;
import org.limepepper.chefclipse.remotepicker.api.ICookbooksRepository.Builder;
import org.limepepper.chefclipse.remotepicker.api.InstallCookbookException;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.CookbookrepositoryFactory;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteRepository;
import org.mockito.Mockito;

/**
 * @author Guillermo Zunino
 *
 */
public class CookbookRepositoryManagerTest {

	private static final String CACHE = "target/cache";
	private static final String CACHE_FAIL = "target/cacheFail";
	private static final CookbookrepositoryFactory factory = CookbookrepositoryFactory.eINSTANCE;
	private CookbookRepositoryManager manager;

	public interface BuilderOfString extends Builder<String> {}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		manager = CookbookRepositoryManager.getInstance();
		manager.setCacheFolder(CACHE_FAIL);
		manager.evictCache();
		
		manager.setCacheFolder(CACHE);
		manager.evictCache();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		manager.evictCache();
	}

	@Test
	public void testRegisterRepository() {
		RemoteRepository repoMock = factory.createRemoteRepository();
		repoMock.setId("repoTest");
		ICookbooksRepository cookbooks = mock(ICookbooksRepository.class);

		manager.registerRepository(repoMock, cookbooks);

		RemoteRepository repository = manager.getRepository("repoTest");
		assertThat(repository).isNotNull();
		assertThat(repository.getId()).isEqualTo(repoMock.getId());
		assertThat(repository.getUri()).isEqualTo(repoMock.getUri());
	}

	@Test
	public void testRegisterParamRepository() {
		Builder<String> builder = mock(BuilderOfString.class);
		RemoteRepository repoMock = factory.createRemoteRepository();
		repoMock.setId("repoParamTest");

		manager.registerRepository(repoMock , builder);

		assertThat(manager.getRepositories()).isEmpty();
		RemoteRepository repository = manager.getRepository("repoParamTest");
		assertThat(repository).isNull();
		
		List<RemoteRepository> repos = manager.getTemplateRepositories();
		assertThat(repos).isNotNull();
		assertThat(repos.size()).isEqualTo(1);
		assertThat(repos.get(0).getId()).isEqualTo(repoMock.getId());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testLoadTemplateRepository() throws InstallCookbookException {
		Builder<String> builder = mock(BuilderOfString.class);
		RemoteRepository repoMock = factory.createRemoteRepository();
		repoMock.setId("repoParamTest");

		manager.registerRepository(repoMock , builder);
		manager.loadRepository(repoMock.getId());
	}
	
	@Test
	public void testConfigureParamRepository() {
		Builder<String> builder = mock(BuilderOfString.class);
		when(builder.configure(Mockito.any(RemoteRepository.class))).thenReturn("parameter");

		RemoteRepository repoMock = factory.createRemoteRepository();
		repoMock.setId("repoParamTest");
		
		manager.registerRepository(repoMock , builder);
		assertThat(manager.getRepositories()).isEmpty();
		
		RemoteRepository paramRepo = manager.configureRepositoryTemplate(repoMock);
		assertThat(paramRepo).isNotNull();
		verify(builder).configure(eq(paramRepo));
		verify(builder).createRepository(eq("parameter"));
		assertThat(manager.getRepositories().size()).isEqualTo(1);
		assertThat(paramRepo).isNotNull();
		assertThat(paramRepo.getId()).isNotEqualTo(repoMock.getId());
		assertThat(manager.getRepository(paramRepo.getId())).isEqualTo(paramRepo);
	}
	
	@Test
	public void testCacheParamRepository() throws InstallCookbookException {
		ICookbooksRepository remote = mockCookbooksResp();
		
		Builder<String> builder = mock(BuilderOfString.class);
		
		when(builder.configure(Mockito.any(RemoteRepository.class))).thenReturn("paramCache");
		when(builder.createRepository(anyString())).thenReturn(remote);
		RemoteRepository repoMock = factory.createRemoteRepository();
		repoMock.setId("repoParamTest");
		
		manager.registerRepository(repoMock , builder);
		assertThat(manager.getRepositories()).isEmpty();
		
		RemoteRepository paramRepo = manager.configureRepositoryTemplate(repoMock);
		assertThat(manager.getRepositories().size()).isEqualTo(1);
		assertThat(paramRepo).isNotNull();
		manager.loadRepository(paramRepo.getId());
	
		manager.setCacheFolder(CACHE_FAIL);
		manager.evictCache();
		manager.setCacheFolder(CACHE);
		assertThat(manager.getRepositories()).isEmpty();
	
		manager.registerRepository(repoMock , builder);
		
		assertThat(manager.getRepositories().size()).isEqualTo(1);
		RemoteRepository cachedRepo = manager.getRepository(paramRepo.getId());
		assertThat(CookbookRepositoryManager.unwrap(cachedRepo.getRetriever())).isEqualTo("paramCache");
		assertThat(cachedRepo.getCookbooks()).isNotNull();
		assertThat(cachedRepo.getCookbooks().size()).isEqualTo(2);
		verify(builder, times(2)).createRepository("paramCache");
	}

	@Test
	public void testConfigureNullParamRepository() {
		Builder<String> builder = mock(BuilderOfString.class);
		when(builder.configure(Mockito.any(RemoteRepository.class))).thenReturn(null);

		RemoteRepository repoMock = factory.createRemoteRepository();
		repoMock.setId("repoParamTest");
		
		manager.registerRepository(repoMock , builder);
		assertThat(manager.getRepositories()).isEmpty();
		
		RemoteRepository paramRepo = manager.configureRepositoryTemplate(repoMock);
		assertThat(paramRepo).isNull();
		verify(builder).configure(Mockito.any(RemoteRepository.class));
		verify(builder, never()).createRepository(anyString());
		assertThat(manager.getRepositories()).isEmpty();
	}

	@Test
	public void testLoadParamRepository() throws InstallCookbookException {
		ICookbooksRepository remote = mockCookbooksResp();
		
		Builder<String> builder = mock(BuilderOfString.class);
		when(builder.configure(Mockito.any(RemoteRepository.class))).thenReturn("param");
		when(builder.createRepository(anyString())).thenReturn(remote);
		RemoteRepository repoMock = factory.createRemoteRepository();
		repoMock.setId("repoParamTest");

		manager.registerRepository(repoMock , builder);
		assertThat(manager.getRepositories()).isEmpty();
		
		RemoteRepository paramRepo = manager.configureRepositoryTemplate(repoMock);
		assertThat(paramRepo).isNotNull();
		manager.loadRepository(paramRepo.getId());

		RemoteRepository repository = manager.getRepository(paramRepo.getId());

		assertThat(repository.getCookbooks()).isNotNull();
		assertThat(repository.getCookbooks().size()).isEqualTo(2);
	}
	
	protected ICookbooksRepository mockCookbooksResp() throws InstallCookbookException {
		ICookbooksRepository remote = mock(ICookbooksRepository.class);
		Collection<RemoteCookbook> cookbooks = new ArrayList<RemoteCookbook>();
		cookbooks.add(createCookbook("c1"));
		cookbooks.add(createCookbook("c2"));
		
		when(remote.getCookbooks()).thenReturn(cookbooks);
		return remote;
	}
	
	@Test
	public void testMultipleRepositories() {
		ICookbooksRepository cookbooks = mock(ICookbooksRepository.class);
		RemoteRepository repo1 = factory.createRemoteRepository();
		repo1.setId("repo1");
		RemoteRepository repo2 = factory.createRemoteRepository();
		repo2.setId("repo2");
		RemoteRepository repo3 = factory.createRemoteRepository();
		repo3.setId("repo3");

		manager.registerRepository(repo1, cookbooks);
		manager.registerRepository(repo2, cookbooks);
		manager.registerRepository(repo3, cookbooks);

		Collection<RemoteRepository> repositories = manager.getRepositories();
		assertThat(repositories).isNotNull();
		assertThat(repositories.size()).isEqualTo(3);
	}

	@Test
	public void testRepositoryCookbooks() throws InstallCookbookException {
		RemoteRepository repoMock = factory.createRemoteRepository();
		repoMock.setId("repoCookbooks");
		ICookbooksRepository remote = mockCookbooksResp();

		manager.registerRepository(repoMock, remote);
		manager.loadRepository("repoCookbooks");
		RemoteRepository repository = manager.getRepository("repoCookbooks");

		assertThat(repository.getCookbooks()).isNotNull();
		assertThat(repository.getCookbooks().size()).isEqualTo(2);
	}

	@Test
	public void testCookbookSource() throws IOException, InstallCookbookException {
		RemoteRepository repoMock = factory.createRemoteRepository();
		repoMock.setId("repoTest");
		ICookbooksRepository remote = mock(ICookbooksRepository.class);
		Collection<RemoteCookbook> cookbooks = new ArrayList<RemoteCookbook>();
		cookbooks.add(createCookbook("c1"));
		cookbooks.add(createCookbook("testCookbook"));
		when(remote.getCookbooks()).thenReturn(cookbooks);
		manager.registerRepository(repoMock, remote);
		manager.loadRepository("repoTest");

		File project = Files.createTempDirectory("testCookbookSource").toFile();
		File downloadCookbook = Files.createTempDirectory("testCookbook").toFile();
		manager.installCookbook(createCookbook("testCookbook"), downloadCookbook,
				project.getAbsolutePath());
		File installed = new File(new File(project, "cookbooks"), "testCookbook");

		RemoteCookbook cookbook = manager.getSourceCookbook(installed);

		assertThat(cookbook).isNotNull();
		assertThat(cookbook.getName()).isEqualTo("testCookbook");
	}
	
	@Test
	public void testRemoteRepository() {
		RemoteRepository repoMock = factory.createRemoteRepository();
		repoMock.setId("repoTest");
		ICookbooksRepository cookbooks = mock(ICookbooksRepository.class);

		manager.registerRepository(repoMock, cookbooks);

		RemoteRepository repository = manager.getRepository("repoTest");
		assertThat(repository).isNotNull();
		manager.removeRepository(repository.getId());
		
		repository = manager.getRepository("repoTest");
		assertThat(repository).isNull();
		assertThat(manager.getRepositories()).isEmpty();
	}

	/**
	 * @return
	 */
	private RemoteCookbook createCookbook(final String id) {
		RemoteCookbook repo = factory.createRemoteCookbook();
		repo.setName(id);
		repo.setRepositoryId("repoTest");
		return repo;
	}

}
