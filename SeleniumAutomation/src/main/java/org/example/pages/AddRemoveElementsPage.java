package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class AddRemoveElementsPage {
    private WebDriver driver;
    private By addButton = By.cssSelector("button[onclick='addElement()']");
    private By deleteButtons = By.cssSelector("#elements button");

    public AddRemoveElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddElement() {
        driver.findElement(addButton).click();
    }

    public void clickDeleteButton(int index) {
        List<WebElement> buttons = driver.findElements(deleteButtons);
        if (index < buttons.size()) {
            buttons.get(index).click();
        }
    }

    public int getDeleteButtonsCount() {
        return driver.findElements(deleteButtons).size();
    }
}
