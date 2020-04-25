package com.hm.frontend;

import com.hm.frontend.pageobjects.GoogleSearchPage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.springframework.beans.factory.annotation.Autowired;

@Execution(ExecutionMode.CONCURRENT)
public class GoogleTest extends TestBase {

    @Autowired
    private GoogleSearchPage googleSearchPage;

    @Test
    void visitGoogle() {
        googleSearchPage
                .typeSearchString("Covid 19")
                .clickSearchButton();

        //TODO - Perform validation
    }
}
