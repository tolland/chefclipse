package org.limepepper.chefclipse.logger;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

import org.eclipse.core.runtime.ILogListener;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.Appender;

public class LoggerPluginTest {

	private LoggerPlugin loggerPlugin;

	@Before
	public void setUp() throws Exception {
		loggerPlugin = LoggerPlugin.getDefault();
		loggerPlugin.getPreferences().clear();
	}

	// Check default preferences
	@Test
	public void testDefaultPreferences() throws Exception {

		IEclipsePreferences preferences = loggerPlugin.getPreferences();
		String[] keys = preferences.keys();
		assertTrue("Incorrect preferences keys size.", keys.length == 4);
		String level = preferences.get(PreferenceConstants.P_LEVEL, "Test");
		String host = preferences.get(PreferenceConstants.P_REMOTEHOST, "1");
		Integer port = Integer.valueOf(preferences.get(
				PreferenceConstants.P_PORT, "80"));
		Boolean isRemoteEnabled = Boolean.valueOf(preferences.get(
				PreferenceConstants.P_REMOTE_LOGGING_ENABLED, "true"));
		assertFalse("Incorrect default value.",
				level.equals("Test") || host.equals("1") || isRemoteEnabled
						|| port == 80);
	}

	// Check presence of default ECLIPSE log appender
	@Test
	public void testEclipseLogger() {
		Logger log = (Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
		Appender<ILoggingEvent> appender = log.getAppender("ECLIPSE");
		assertNotNull(appender);

		final org.slf4j.Logger slf4jLogger = LoggerFactory.getLogger(this
				.getClass());

		final ArrayList<IStatus> statusList = new ArrayList<IStatus>();

		Platform.addLogListener(new ILogListener() {

			@Override
			public void logging(IStatus status, String plugin) {
				statusList.add(status);
			}
		});
		slf4jLogger.error("test");
		assertFalse("Error message absent in Eclipse log.",
				statusList.size() == 0);
	}

	@Test
	public void testUDPAppender() throws Exception {
		IEclipsePreferences preferences = loggerPlugin.getPreferences();
		preferences.putBoolean(PreferenceConstants.P_REMOTE_LOGGING_ENABLED,
				true);
		preferences.put(PreferenceConstants.P_REMOTEHOST, "127.0.0.1");
		loggerPlugin.configureLoggers();
		final org.slf4j.Logger slf4jLogger = LoggerFactory.getLogger(this
				.getClass());

		final ReentrantLock lock = new ReentrantLock();

		new Thread(new Runnable() {

			@Override
			public void run() {
				DatagramSocket serverSocket = null;
				try {
					lock.lock();
					serverSocket = new DatagramSocket(9999);
					byte[] receiveData = new byte[1024];
					DatagramPacket receivePacket = new DatagramPacket(
							receiveData, receiveData.length);
					serverSocket.receive(receivePacket);
					String sentence = new String(receivePacket.getData(), 0,
							receivePacket.getLength());
					System.out.println("RECEIVED: " + sentence);
					// Unlock inside try to check normal flow
					lock.unlock();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					if (serverSocket != null)
						serverSocket.close();
				}
			}

		}).start();
		Thread.sleep(1000);
		slf4jLogger.info("Test message");
		lock.tryLock(1, TimeUnit.SECONDS);
		assertTrue("Messaged not passed.", lock.isHeldByCurrentThread());
	}

}
