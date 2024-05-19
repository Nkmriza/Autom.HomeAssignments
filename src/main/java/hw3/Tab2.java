package hw3;

import driver_init.DriverInit;
import org.openqa.selenium.*;
import urls.Urls;

public class Tab2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverInit.setUpDriver();
        driver.get(Urls.hyrtu);
        WebElement firstEl = driver.findElement(By.xpath("//*[@id='alertBox']"));
        firstEl.click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        Thread.sleep(2000);
        WebElement secEl = driver.findElement(By.xpath("//*[@id='confirmBox']"));
        secEl.click();
        Thread.sleep(2000);
        Alert alert2 = driver.switchTo().alert();
        alert2.dismiss();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");
        WebElement thirdEl = driver.findElement(By.cssSelector("#promptBox"));
        thirdEl.click();
        Thread.sleep(2000);
        Alert alert3 = driver.switchTo().alert();
        alert3.sendKeys("Final step of this task");
        alert3.accept();
        Thread.sleep(3000);
        driver.close();
    }
}
