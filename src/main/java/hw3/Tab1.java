package hw3;

import driver_init.DriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import urls.Urls;

public class Tab1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverInit.setUpDriver();
        driver.get(Urls.guinnes);
        Thread.sleep(2000);
        try {
            driver.findElement(By.id("ez-accept-all")).click();
        } catch (NoSuchElementException e) {
            System.out.println("No cookies button");
        }
        WebElement lastName = driver.findElement(By.xpath("//*[@id='LastName']"));
        lastName.sendKeys("Yakuba");
        Thread.sleep(1000);
        WebElement firstName = driver.findElement(By.xpath("//*[@id='FirstName']"));
        firstName.sendKeys("Yelyzaveta");
        WebElement dateOfb = driver.findElement(By.xpath("//*[@id='DateOfBirthDay']"));
        dateOfb.sendKeys("30");
        WebElement month = driver.findElement(By.xpath("//*[@id='DateOfBirthMonth']"));
        month.sendKeys("11");
        WebElement year = driver.findElement(By.xpath("//*[@id='DateOfBirthYear']"));
        year.sendKeys("1997");
        WebElement region = driver.findElement(By.cssSelector("#Country"));
        Select reg = new Select(region);
        reg.selectByVisibleText("Ukraine");
        WebElement state = driver.findElement(By.xpath("//*[@id='State']"));
        state.sendKeys("Kyiv");
        Thread.sleep(1000);
        WebElement email= driver.findElement(By.xpath("//*[@id='EmailAddress']"));
        email.sendKeys("email@email.com");
        WebElement email2 = driver.findElement(By.xpath("//*[@id='ConfirmEmailAddress']"));
        email2.sendKeys("email@email.com");
        driver.close();
    }
}
