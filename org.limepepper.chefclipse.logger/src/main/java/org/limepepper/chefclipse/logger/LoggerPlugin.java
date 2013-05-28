package org.limepepper.chefclipse.logger;

import java.io.InputStream;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.IEclipsePreferences.IPreferenceChangeListener;
import org.eclipse.core.runtime.preferences.IEclipsePreferences.PreferenceChangeEvent;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.limepepper.chefclipse.logger.appender.UDPAppender;
import org.osgi.framework.BundleContext;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.contrib.jackson.JacksonJsonFormatter;
import ch.qos.logback.contrib.json.classic.JsonLayout;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.util.StatusPrinter;

public class LoggerPlugin extends Plugin {

	public static final String PLUGIN_ID = "org.limepepper.chefclipse.logger"; //$NON-NLS-1$

	private static BundleContext context;

	private static org.slf4j.Logger log;

	private static LoggerPlugin plugin;

	static BundleContext getContext() {
		return context;
	}

	public static LoggerPlugin getDefault() {
		return plugin;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext
	 * )
	 */
	public void start(BundleContext bundleContext) throws Exception {
		LoggerPlugin.context = bundleContext;
		plugin = this;
		configureLoggers();
		log = LoggerFactory.getLogger(LoggerPlugin.class);
		log.trace(PLUGIN_ID + " started.");
		// initPreferences();
	}

	private void initPreferences() {
		final IEclipsePreferences preferences = getPreferences();
		preferences
				.addPreferenceChangeListener(new IPreferenceChangeListener() {

					@Override
					public void preferenceChange(PreferenceChangeEvent event) {
						String key = event.getKey();
						Object value = event.getNewValue();
						if (value == null)
							value = event.getOldValue();
						switch (key) {
						case PreferenceConstants.P_LEVEL:
							Logger root = (Logger) LoggerFactory
									.getLogger(Logger.ROOT_LOGGER_NAME);
							root.setLevel(Level.toLevel((String) value));
							log.info("Logging level changed to: " + value);
							break;
						case PreferenceConstants.P_REMOTEHOST:
							break;
						case PreferenceConstants.P_PORT:
							break;
						default:
							break;
						}
					}
				});
	}

	public IEclipsePreferences getPreferences() {
		return InstanceScope.INSTANCE.getNode(PLUGIN_ID);
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see
	 * org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		LoggerPlugin.context = null;
	}

	public void configureLoggers() {
		// assume SLF4J is bound to logback in the current environment
		LoggerContext logContext = (LoggerContext) LoggerFactory
				.getILoggerFactory();

		try {
			JoranConfigurator configurator = new JoranConfigurator();
			configurator.setContext(logContext);
			// Call context.reset() to clear any previous configuration, e.g.
			// default
			// configuration. For multi-step configuration, omit calling
			// context.reset().
			logContext.reset();
			InputStream configStream = this.getClass().getClassLoader()
					.getResourceAsStream("logback-config.xml");
			System.out.println("Config stream: " + configStream);
			configurator.doConfigure(configStream);
			Logger root = (Logger) LoggerFactory
					.getLogger(Logger.ROOT_LOGGER_NAME);
			IEclipsePreferences prefs = getPreferences();
			String level = prefs.get(PreferenceConstants.P_LEVEL, "INFO");
			String host = prefs.get(PreferenceConstants.P_REMOTEHOST,
					"logger.limepepper.co.uk");
			Integer port = Integer.valueOf(prefs.get(
					PreferenceConstants.P_PORT, "9999"));
			Boolean isRemoteEnabled = Boolean.valueOf(prefs.get(
					PreferenceConstants.P_REMOTE_LOGGING_ENABLED, "false"));

			// Save defaults
			prefs.put(PreferenceConstants.P_LEVEL, level);
			prefs.put(PreferenceConstants.P_REMOTEHOST, host);
			prefs.putInt(PreferenceConstants.P_PORT, port);
			prefs.putBoolean(PreferenceConstants.P_REMOTE_LOGGING_ENABLED,
					isRemoteEnabled);

			if (root.getAppender("UDP") != null) {
				root.getAppender("UDP").stop();
				root.detachAppender("UDP");
			}

			if (isRemoteEnabled) {
				JacksonJsonFormatter formatter = new JacksonJsonFormatter();
				JsonLayout layout = new JsonLayout();
				layout.setJsonFormatter(formatter);
				layout.start();

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					log.warn("Interrupted.", e);
				}

				UDPAppender appender = new UDPAppender();
				appender.setRemoteHost(host);
				appender.setPort(port);
				appender.setName("UDP");
				appender.setLayout(layout);
				appender.start();

				root.addAppender(appender);
			}

			root.setLevel(Level.toLevel(level));
		} catch (JoranException je) {
			// StatusPrinter will handle this
		}
		StatusPrinter.printInCaseOfErrorsOrWarnings(logContext);
	}

}
