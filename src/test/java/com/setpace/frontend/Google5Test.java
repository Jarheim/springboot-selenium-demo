package com.setpace.frontend;

import com.setpace.frontend.config.EnvironmentProperties;
import com.setpace.frontend.pageobjects.GoogleSearchPage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.springframework.beans.factory.annotation.Autowired;

@Execution(ExecutionMode.CONCURRENT)
public class Google5Test extends TestBase {
    @Autowired
    private GoogleSearchPage littlePageObject;

    @Autowired
    private EnvironmentProperties environmentProperties;

    @Test
    void visitGoogle() throws Exception {
        driver.get(environmentProperties.getUrl());

        littlePageObject.justTesting("https://www.google.de/");

        if(!driver.getCurrentUrl().equalsIgnoreCase("https://www.google.de/")) {
            System.out.println("hej hej");
            throw new Exception("faaail");
        }
    }

    @Test
    void visitGoogleAgain() throws Exception {
        driver.get(environmentProperties.getUrl());

        littlePageObject.justTesting("https://www.freeride.se/");

        if(!driver.getCurrentUrl().equalsIgnoreCase("https://www.freeride.se/")) {
            System.out.println("hej hej");
            throw new Exception("faaail");
        }
    }
}
