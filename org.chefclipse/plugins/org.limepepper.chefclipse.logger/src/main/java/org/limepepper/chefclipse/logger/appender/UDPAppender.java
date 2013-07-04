package org.limepepper.chefclipse.logger.appender;

import ch.qos.logback.classic.net.SyslogAppender;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.Layout;

public class UDPAppender extends SyslogAppender {

	Layout<ILoggingEvent> layout;
	String remoteHost;
	

	public UDPAppender() {
		super();
		setFacility("USER");
	}

	public String getRemoteHost() {
		return getSyslogHost();
	}

	public void setRemoteHost(String remoteHost) {
		setSyslogHost(remoteHost);
	}

	public Layout<ILoggingEvent> getLayout() {
		return layout;
	}

	public void setLayout(Layout<ILoggingEvent> layout) {
		this.layout = layout;
	}

	@Override
	public Layout<ILoggingEvent> buildLayout() {
		return this.layout;
	}

}
