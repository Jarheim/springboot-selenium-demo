package com.setpace.frontend.pageobjects;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LittlePageObject {

    @Autowired
    private WebDriver driver;

    public void justTesting() {
        driver.manage().window().maximize();
    }
}
