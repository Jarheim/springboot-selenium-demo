package com.hm.driver;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.hm")
public class WebConfig extends DriverCreator {

    @Value("${base_url}")
    private String baseUrl;

    @Bean
    public WebDriver webDriver() {
        WebDriver webDriver = CreateWebDriver();
        webDriver.get(baseUrl);
        return webDriver;
    }
}
