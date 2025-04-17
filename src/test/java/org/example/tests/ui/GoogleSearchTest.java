package org.example.tests.ui;

import org.example.tests.ui.pages.GooglePage;
import org.junit.jupiter.api.Test;

public class GoogleSearchTest extends BaseTest {

    @Test
    public void testGoogleSearch() {
        GooglePage google = new GooglePage(driver);
        google.open();
        google.search("Selenium WebDriver");
    }
}
