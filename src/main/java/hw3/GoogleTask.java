package hw3;

import driver_init.DriverInit;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import urls.Urls;

import java.util.Set;

public class GoogleTask {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverInit.setUpDriver();
        driver.get(Urls.google);
        WebElement searchField = driver.findElement(By.xpath("//*[@id='APjFqb']"));
        searchField.sendKeys("https://www.guinnessworldrecords.com/account/register?");
        searchField.sendKeys(Keys.ENTER);
        WebElement link1 = driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div/div[1]/div/div/span/a/h3"));
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.COMMAND).click(link1).keyUp(Keys.COMMAND).build().perform();
        /*actions.keyDown(Keys.CONTROL).click(link1).keyUp(Keys.CONTROL).build().perform();*/
        Thread.sleep(3000);
        WebElement clearB = driver.findElement(By.cssSelector("#tsf > div:nth-child(1) > div.A8SBwf > div.RNNXgb > div > div.dRYYxd > div.BKRPef > div > span > svg"));
        clearB.click();
        Thread.sleep(3000);
        searchField = driver.findElement(By.xpath("//*[@id='APjFqb']"));
        searchField.sendKeys("https://www.hyrtutorials.com/p/alertsdemo.html");
        searchField.sendKeys(Keys.ENTER);
        WebElement link2 = driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div/div[1]/div/div/span/a/h3"));
        actions.keyDown(Keys.COMMAND).click(link2).keyUp(Keys.COMMAND).build().perform();
        /*actions.keyDown(Keys.CONTROL).click(link2).keyUp(Keys.CONTROL).build().perform();*/
        Thread.sleep(2000);
        driver.get(Urls.schoolsSubm);
        Thread.sleep(2000);
        try {
            driver.findElement(By.id("ez-accept-all")).click();
        } catch (NoSuchElementException e) {
            System.out.println("No cookies button");
        }
        Thread.sleep(3000);
        WebElement nameField = driver.findElement(By.linkText("First name"));
        nameField.sendKeys("Liza");

        WebElement surnameField = driver.findElement(By.linkText("Last name"));
        surnameField.clear();
        surnameField.sendKeys("Yakuba");
//НЕ ПОЛУЧАЕТСЯ

    }
}
