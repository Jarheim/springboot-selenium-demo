package integration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import stuff.WebContext;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = WebContext.class)
public class TestBase {

    @Autowired
    WebDriver driver;

    @AfterEach
    public void cleanUpTest() {
        driver.quit();
    }
}
