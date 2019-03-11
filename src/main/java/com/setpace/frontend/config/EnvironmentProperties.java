package com.setpace.frontend.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "env")
@Getter @Setter
public class EnvironmentProperties {
    private String urlUnderTest;
}