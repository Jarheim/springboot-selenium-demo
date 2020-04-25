package com.hm.frontend.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class GoogleSearchPage {

    @Lazy
    @Autowired
    private WebDriver driver;

    public GoogleSearchPage typeSearchString(String url) {
        driver.findElement(By.name("q")).sendKeys(url);
        return this;
    }

    public GoogleSearchPage clickSearchButton() {
        driver.findElement(By.name("btnK")).click();
        return this;
    }
}
