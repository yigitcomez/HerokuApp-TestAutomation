package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChallengingDomPage {

    private WebDriver driver;

    private By button1 = By.cssSelector(".button");
    private By button2 = By.cssSelector(".button.alert");
    private By button3 = By.cssSelector(".button.success");
    private By table = By.tagName("table");

    public ChallengingDomPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickFirstButton() {
        driver.findElement(button1).click();
    }

    public void clickSecondButton() {
        driver.findElement(button2).click();
    }

    public void clickThirdButton() {
        driver.findElement(button3).click();
    }

    public String getCellData(int row, int col) {
        String xpath = String.format("//table/tbody/tr[%d]/td[%d]", row, col);
        return driver.findElement(By.xpath(xpath)).getText();
    }

    public boolean isTableDisplayed() {
        return driver.findElement(table).isDisplayed();
    }
}
