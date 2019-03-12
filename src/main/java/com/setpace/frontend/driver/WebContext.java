package com.setpace.frontend.driver;

import com.setpace.frontend.config.EnvironmentProperties;
import com.setpace.frontend.config.WebDriverProperties;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "com.setpace.frontend")
@Configuration
@EnableConfigurationProperties({EnvironmentProperties.class, WebDriverProperties.class})
public class WebContext extends DriverCreator {

    @Autowired
    private WebDriverProperties webDriverProperties;

    @Bean
    public WebDriver webDriver() {
        return CreateWebDriver();
    }
}
