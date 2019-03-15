package com.setpace.frontend;

import com.setpace.frontend.config.EnvironmentProperties;
import com.setpace.frontend.pageobjects.GoogleSearchPage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.springframework.beans.factory.annotation.Autowired;

@Execution(ExecutionMode.CONCURRENT)
public class Google4Test extends TestBase {
    @Autowired
    private GoogleSearchPage littlePageObject;

    @Autowired
    private EnvironmentProperties environmentProperties;

    @Test
    void visitGoogle() throws Exception {
        driver.get(environmentProperties.getUrl());

        littlePageObject.justTesting("https://www.di.se/");

        if(!driver.getCurrentUrl().equalsIgnoreCase("https://www.di.se/")) {
            System.out.println("hej hej");
            throw new Exception("faaail");
        }
    }

    @Test
    void visitGoogleAgain() throws Exception {
        driver.get(environmentProperties.getUrl());

        littlePageObject.justTesting("https://www.volvo.com/home.html");

        if(!driver.getCurrentUrl().equalsIgnoreCase("https://www.volvo.com/home.html")) {
            System.out.println("hej hej");
            throw new Exception("faaail");
        }
    }
}
