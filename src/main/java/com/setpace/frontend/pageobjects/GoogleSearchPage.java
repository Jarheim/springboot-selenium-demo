package com.setpace.frontend.pageobjects;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class GoogleSearchPage {

    @Lazy
    @Autowired
    private WebDriver driver;

    public void justTesting() {
        driver.manage().window().maximize();
    }

    public void justTesting(String url) {
        driver.get(url);
    }
}
