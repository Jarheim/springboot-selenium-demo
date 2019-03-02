package stuff;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@Component
public class LittlePageObject {
    @Autowired
    protected WebDriver driver;

    public void justTesting() {
        driver.manage().window().maximize();
    }
}
