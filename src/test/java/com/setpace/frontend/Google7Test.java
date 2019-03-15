package com.setpace.frontend;

import com.setpace.frontend.config.EnvironmentProperties;
import com.setpace.frontend.pageobjects.GoogleSearchPage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.springframework.beans.factory.annotation.Autowired;

@Execution(ExecutionMode.CONCURRENT)
public class Google7Test extends TestBase {

    @Autowired
    private GoogleSearchPage littlePageObject;

    @Autowired
    private EnvironmentProperties environmentProperties;

    @Test
    void visitGoogleNow() throws Exception {
        driver.get(environmentProperties.getUrl());

        littlePageObject.justTesting("https://seb.se/");

        if(!driver.getCurrentUrl().equalsIgnoreCase("https://seb.se/")) {
            System.out.println("hej hej");
            throw new Exception("faaail");
        }
    }

    @Test
    void visitGoogleNowAgain() throws Exception {
        driver.get(environmentProperties.getUrl());

        littlePageObject.justTesting("https://danskebank.se/privat");

        if(!driver.getCurrentUrl().equalsIgnoreCase("https://danskebank.se/privat")) {
            System.out.println("hej hej");
            throw new Exception("faaail");
        }
    }
}
