package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckboxesPage {
    private WebDriver driver;
    private By checkbox1 = By.cssSelector("#checkboxes input:nth-of-type(1)");
    private By checkbox2 = By.cssSelector("#checkboxes input:nth-of-type(2)");

    public CheckboxesPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isCheckbox1Selected() {
        return driver.findElement(checkbox1).isSelected();
    }

    public boolean isCheckbox2Selected() {
        return driver.findElement(checkbox2).isSelected();
    }

    public void toggleCheckbox1() {
        driver.findElement(checkbox1).click();
    }

    public void toggleCheckbox2() {
        driver.findElement(checkbox2).click();
    }
}
