package com.sidecar;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
public class SessionServiceSidecarProperties {

	@Value("${sidecar.hostname}")
	private String hostname;

	@Value("${sidecar.port}")
	private Integer port;

	public String getHostname() {
		return hostname;
	}

	public Integer getPort() {
		return port;
	}

}
