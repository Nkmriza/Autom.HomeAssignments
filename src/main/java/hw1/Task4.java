package hw1;

import driver_init.DriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import urls.Urls;

public class Task4 {
    /*Написати програму, яка повторює дію на відео "HW_AUTOMATION_LESSON_3_UPDATE.mp4".
http://www.automationpractice.pl/index.php*/
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverInit.setUpDriver();
        driver.get(Urls.shop);
        WebElement searchField = driver.findElement(By.xpath("//*[@id='search_query_top']"));
        searchField.sendKeys("Printed Chiffon Dress");
        searchField.sendKeys(Keys.ENTER);
        WebElement dress1 = driver.findElement(By.cssSelector("#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.last-line.first-item-of-tablet-line.first-item-of-mobile-line.last-mobile-line > div > div.right-block > h5 > a"));
        dress1.click();
        Thread.sleep(1000);
        WebElement elementSize = driver.findElement(By.id("group_1"));
        Select size = new Select(elementSize);
        size.selectByVisibleText("M");
        Thread.sleep(1000);
        WebElement addToC = driver.findElement(By.xpath("//*[@id='add_to_cart']/button/span"));
        addToC.click();
        Thread.sleep(2000);
        driver.switchTo().activeElement();
        WebElement continueSh = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/span/span/i"));
        Thread.sleep(2000);
        continueSh.click();
        driver.switchTo().activeElement();
        WebElement womanB = driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[1]/a"));
        womanB.click();
        WebElement searchField2 = driver.findElement(By.xpath("//*[@id='search_query_top']"));
        searchField2.sendKeys("Faded Short");
        searchField2.sendKeys(Keys.ENTER);
        WebElement short1 = driver.findElement(By.cssSelector("#center_column > ul > li > div > div.right-block > h5 > a"));
        short1.click();
       // Не могу добавить в корзину : This product is no longer in stock
        WebElement cart = driver.findElement(By.cssSelector("#header > div:nth-child(3) > div > div > div:nth-child(3) > div > a"));
        cart.click();
        driver.quit();
    }
}
