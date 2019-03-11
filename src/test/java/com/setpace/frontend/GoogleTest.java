package com.setpace.frontend;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.setpace.frontend.config.EnvironmentProperties;
import com.setpace.frontend.pageobjects.LittlePageObject;

class GoogleTest extends TestBase {
    @Autowired
    private LittlePageObject littlePageObject;

    @Autowired
    private EnvironmentProperties environmentProperties;

    @Test
    void visitGoogle() {
        driver.get(environmentProperties.getUrlUnderTest());

        littlePageObject.justTesting();
    }
}
