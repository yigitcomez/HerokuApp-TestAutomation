package org.example.tests;

import org.example.pages.LoginPage;
import org.example.pages.SecureAreaPage;
import org.example.utils.NavigationHelper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testValidLogin() {
        NavigationHelper navigator = new NavigationHelper(driver);
        navigator.navigateTo("/login");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickLogin();

        SecureAreaPage secureArea = new SecureAreaPage(driver);
        Assert.assertTrue(secureArea.getFlashMessage().contains("You logged into a secure area"));
    }

    @Test
    public void testInvalidLogin() {
        NavigationHelper navigator = new NavigationHelper(driver);
        navigator.navigateTo("/login");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("invalid");
        loginPage.enterPassword("invalid");
        loginPage.clickLogin();

        SecureAreaPage secureArea = new SecureAreaPage(driver);
        Assert.assertTrue(secureArea.getFlashMessage().contains("Your username is invalid"));
    }
}
