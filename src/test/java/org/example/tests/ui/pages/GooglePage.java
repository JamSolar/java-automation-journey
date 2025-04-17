package org.example.tests.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePage extends BasePage {

    private final By searchField = By.name("q");

    public GooglePage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("https://www.google.com");
    }

    public void search(String query) {
        WebElement input = driver.findElement(searchField);
        type(input, query + Keys.ENTER);  // ✅ используем метод из BasePage
    }
}
