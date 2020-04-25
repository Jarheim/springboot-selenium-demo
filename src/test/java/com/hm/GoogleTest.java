package com.hm;

import com.hm.pageobjects.GoogleSearchPage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.springframework.beans.factory.annotation.Autowired;

@Execution(ExecutionMode.CONCURRENT)
public class GoogleTest extends TestBase {

    @Autowired
    private GoogleSearchPage googleSearchPage;

    @Test
    void searchOnGoogle() {
        googleSearchPage
                .typeSearchString("Hm home buy pillows")
                .clickSearchButton();

        //TODO - Perform validation
    }
}
