package integration;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import stuff.LittlePageObject;
import stuff.WebContext;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = WebContext.class)
@ComponentScan(basePackages = "stuff")
@EnableAutoConfiguration
public class GoogleTest {
    @Autowired
    private WebDriver driver;

    @Autowired
    private LittlePageObject littlePageObject;

    @Test
    public void visitGoogle() {
        driver.get("https://www.google.se/");

        littlePageObject.justTesting();
    }
}
