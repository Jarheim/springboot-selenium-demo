package com.hm.driver;

import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
abstract class DriverCreator {

    @Value("${driver}")
    private String driver;

    @Autowired
    private ChromeDriverCreator chromeDriverCreator;

    protected WebDriver CreateWebDriver() {
        switch (driver) {
            case "chrome":
                return chromeDriverCreator.createChromeDriver();
            default:
                throw new NotImplementedException("Driver not implemented");
        }
    }
}
