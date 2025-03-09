package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Main {
    static WebDriver driver = new ChromeDriver();

    @BeforeTest
    public void beforeTest() {

        driver.get("https://the-internet.herokuapp.com/");
        System.out.println("Title is : " + driver.getTitle());
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

    }

    @Test
    public void failingTest() {
        // Test başarısız
        assert false; // Bu test her zaman başarısız olacak
    }

    @Test
    public void skippedTest() {
        throw new RuntimeException("Atlanmış test örneği"); // Bu test bir hata fırlatarak atlanacak
    }

    @Test(testName = "AddElement Page Test")
    public static void AddElementTest() throws InterruptedException {


        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[2]/a")).click();

        //click mora than 1 times
        for (int i = 0; i < 2; i++) {
            //click the button
            driver.findElement(By.xpath("//*[@id=\"content\"]/div/button")).click();
            //wait 2 seconds
            Thread.sleep(2000);
            //check that data is being generated correctly
        }

//        List<WebElement> deleteElement = (List<WebElement>) driver.findElement(By.cssSelector("#elements > button:nth-child(1)"));
        WebElement deleteElement = driver.findElement(By.cssSelector("#elements > button:nth-child(2)"));
        System.out.println("Delete element's gets are : " + deleteElement.getAccessibleName());


        List<WebElement> deleteButtons = driver.findElements(By.className("added-manually"));
        // Bulunan butonların sayısını yazdırma
        System.out.println("Bulunan Delete buton sayısı: " + deleteButtons.size());

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Her bir Delete butonuna tıklama
        for (WebElement button : deleteButtons) {
            // Butonun görünmesini bekleyin
            wait.until(ExpectedConditions.elementToBeClickable(button));

            // Butona tıklama
            button.click();

            // Silme işlemi tamamlandıktan sonra güncellenen elementlerin sayısını almak için yeni bir buton listesi almak isteyebilirsiniz
            deleteButtons = driver.findElements(By.className("added-manually"));
            System.out.println("Kalan Delete buton sayısı: " + deleteButtons.size());
        }


//        Boolean visible = driver.findElement(By.xpath("//*[@id=\"elements\"]/button")).isDisplayed();
//        if (visible)
//            driver.quit();


    }
}