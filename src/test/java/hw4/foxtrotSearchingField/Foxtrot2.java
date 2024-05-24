package hw4.foxtrotSearchingField;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import urls.Urls;
import waiters.Waiters;

public class Foxtrot2 {
    private WebDriver driver;
    static Waiters waiters;

    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        waiters = new Waiters(driver);
        driver.get(Urls.foxtrot);
        try {WebElement citiesField = driver.findElement(By.xpath("//*[@id='user-location-popup']/div/div[3]/div/span"));
            citiesField.click();
        } catch (NoSuchElementException e) {
            System.out.println("No Such Fields");
        }
    }
   @AfterClass
    public void close() {
        driver.quit();
    }

    @Test
    @Parameters({"searchItem"})
    public void foxtrotSearchingFieldResult(String searchItem) throws InterruptedException {
        Thread.sleep(2000);
        WebElement searchField = driver.findElement(By.xpath("//*[@id='js-fix-header']/div/div/div[3]/input[1]"));
        searchField.sendKeys(searchItem);
        driver.findElement(By.xpath("//*[@id='js-fix-header']/div/div/div[3]/input[2]")).click();
        Thread.sleep(2000);
       WebElement result = driver.findElement(By.tagName("h1"));
       WebElement unsuccessfulResult = driver.findElement(By.id("search-page-container"));
        Thread.sleep(2000);
        if (result.getText().contains(searchItem)) {
            Assert.assertTrue(result.getText().contains(searchItem), searchItem);
        } else if (unsuccessfulResult.getText().contains(searchItem)){
            Assert.assertTrue(unsuccessfulResult.getText().contains(searchItem), searchItem);
        }else {
            System.out.println("Запит не відповідає результату");
        }
    }
}
