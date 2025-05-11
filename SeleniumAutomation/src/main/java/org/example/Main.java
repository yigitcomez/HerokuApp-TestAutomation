package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Main {

    static WebDriver driver;

    @BeforeTest
    public void setUp() {
        // WebDriverManager ile doğru ChromeDriver sürümünü belirtmek
        WebDriverManager.chromedriver().driverVersion("134.0.6998.45").setup();
        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");
        System.out.println("Title is : " + driver.getTitle());
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void failingTest() {
        assert false;
    }

    @Test
    public void skippedTest() {
        throw new RuntimeException("Atlanmış test örneği");
    }

    @Test(testName = "AddElement Page Test")
    public void AddElementTest() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[2]/a")).click();

        for (int i = 0; i < 2; i++) {
            driver.findElement(By.xpath("//*[@id=\"content\"]/div/button")).click();
            Thread.sleep(2000);
        }

        WebElement deleteElement = driver.findElement(By.cssSelector("#elements > button:nth-child(2)"));
        System.out.println("Delete element's gets are : " + deleteElement.getAccessibleName());

        List<WebElement> deleteButtons = driver.findElements(By.className("added-manually"));
        System.out.println("Bulunan Delete buton sayısı: " + deleteButtons.size());

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        for (WebElement button : deleteButtons) {
            wait.until(ExpectedConditions.elementToBeClickable(button));
            button.click();
            deleteButtons = driver.findElements(By.className("added-manually"));
            System.out.println("Kalan Delete buton sayısı: " + deleteButtons.size());
        }
    }
}
