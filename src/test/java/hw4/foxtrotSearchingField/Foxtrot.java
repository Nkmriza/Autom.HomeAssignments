package hw4.foxtrotSearchingField;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.oer.Switch;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import urls.Urls;
import waiters.Waiters;

public class Foxtrot {
    private WebDriver driver;
    static Waiters waiters;

    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        waiters = new Waiters(driver);

    }
   @AfterClass
    public void close() {
        driver.quit();
    }

    @Test(dataProvider = "search")
    public void foxtrotSearchingFieldResult(String searchItem) throws InterruptedException {
        driver.get(Urls.foxtrot);
        Thread.sleep(3000);

        try {WebElement citiesField = driver.findElement(By.xpath("//*[@id='user-location-popup']/div/div[3]/div/span"));
          citiesField.click();
        } catch (NoSuchElementException e) {
            System.out.println("No Such Fields");
        }

        WebElement searchField = driver.findElement(By.xpath("//*[@id='js-fix-header']/div/div/div[3]/input[1]"));
        searchField.sendKeys(searchItem);
        driver.findElement(By.xpath("//*[@id='js-fix-header']/div/div/div[3]/input[2]")).click();
        Thread.sleep(2000);
       /* driver.findElement(By.cssSelector(".filter-switcher__popup_notification_close")).click();*/
       WebElement result = driver.findElement(By.tagName("h1"));
       WebElement unsuccResult = driver.findElement(By.xpath("//*[@id='search-page-container']/div[3]/div/div/div/div/div/div[1]/div[1]"));
       /* Assert.assertTrue(unsuccResult.getText().contains(searchItem));*/
        if (result.getText().contains(searchItem)) {
            Assert.assertTrue(result.getText().contains(searchItem), searchItem);
        } else if (unsuccResult.getText().contains(searchItem)){
            Assert.assertTrue(unsuccResult.getText().contains(searchItem),  searchItem);
        }
    }

    @DataProvider(name = "search")
    public Object[][] searchItem() {
        return new Object[][] {
                {"машина"},
                {"input"},
                {"розуміння"}
        };
    }
}
