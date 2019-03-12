package com.setpace.frontend.driver;

import com.setpace.frontend.config.WebDriverProperties;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.lang3.NotImplementedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;

abstract class DriverCreator {

    @Autowired
    private WebDriverProperties webDriverProperties;

    protected WebDriver CreateWebDriver() {
        switch (webDriverProperties.getDriver()) {
            case "chrome":
                return createChromeDriver();
            default:
                throw new NotImplementedException("Driver not implemented");
        }
    }

    private ChromeDriver createChromeDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
}
