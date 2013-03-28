/**
 * 
 */
package org.limepepper.chefclipse.remotepicker.test.api;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.limepepper.chefclipse.remotepicker.api.CookbookRepositoryManager;
import org.limepepper.chefclipse.remotepicker.api.ICookbooksRepository;
import org.limepepper.chefclipse.remotepicker.api.InstallCookbookException;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.CookbookrepositoryFactory;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteCookbook;
import org.limepepper.chefclipse.remotepicker.api.cookbookrepository.RemoteRepository;

/**
 * @author Guillermo Zunino
 *
 */
public class CookbookRepositoryManagerTest {

	private static final CookbookrepositoryFactory factory = CookbookrepositoryFactory.eINSTANCE;
	private CookbookRepositoryManager manager;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		manager = CookbookRepositoryManager.getInstance();
		manager.setCacheFolder("cache");
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
		assertThat(repository, notNullValue());
		assertThat(repository.getId(), equalTo(repoMock.getId()));
		assertThat(repository.getUri(), equalTo(repoMock.getUri()));
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
		assertThat(repositories, notNullValue());
		assertThat(repositories.size(), equalTo(3));
	}

	@Test
	public void testRepositoryCookbooks() {
		RemoteRepository repoMock = factory.createRemoteRepository();
		repoMock.setId("repoCookbooks");
		ICookbooksRepository remote = mock(ICookbooksRepository.class);
		Collection<RemoteCookbook> cookbooks = new ArrayList<RemoteCookbook>();
		cookbooks.add(createCookbook("c1"));
		cookbooks.add(createCookbook("c2"));

		when(remote.getCookbooks()).thenReturn(cookbooks);

		manager.registerRepository(repoMock, remote);
		manager.loadRepository("repoCookbooks");
		RemoteRepository repository = manager.getRepository("repoCookbooks");

		assertThat(repository.getCookbooks(), notNullValue());
		assertThat(repository.getCookbooks().size(), equalTo(2));
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
		File installed = new File(new File(project, "cookbooks"), downloadCookbook.getName());

		RemoteCookbook cookbook = manager.getSourceCookbook(installed);

		assertThat(cookbook, notNullValue());
		assertThat(cookbook.getName(), equalTo("testCookbook"));
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
