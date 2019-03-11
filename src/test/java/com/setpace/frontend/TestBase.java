package com.setpace.frontend;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import com.setpace.frontend.driver.WebContext;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = WebContext.class)
public abstract class TestBase {

    @Autowired
    WebDriver driver;

    @AfterEach
    public void cleanUpTest() {
        driver.quit();
    }
}
