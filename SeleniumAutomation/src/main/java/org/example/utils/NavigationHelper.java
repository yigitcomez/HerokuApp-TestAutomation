package org.example.utils;

import org.openqa.selenium.WebDriver;

public class NavigationHelper {

    private WebDriver driver;

    public NavigationHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateTo(String path) {
        String fullUrl = ConfigReader.BASE_URL + path;
        driver.get(fullUrl);
    }
}
