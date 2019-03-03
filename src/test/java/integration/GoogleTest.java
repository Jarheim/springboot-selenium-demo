package integration;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import stuff.LittlePageObject;

class GoogleTest extends TestBase {

    @Autowired
    private LittlePageObject littlePageObject;

    @Test
    void visitGoogle() {
        driver.get("https://www.google.se/");

        littlePageObject.justTesting();
    }
}
