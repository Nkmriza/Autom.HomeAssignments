package hw2;

import driver_init.DriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import urls.Urls;

import javax.swing.*;

public class Task2 {
    /*
    2) https://demo.guru99.com/test/drag_drop.html
    Написати програму, яка автоматизуватиме сценарій показаний на відео
     "Сценарій для автоматизії.mov". Після виконання сценарію відео вивести
     в консоль теуст кнопки "Perfect!"*/
    public static void main(String[] args) {
        WebDriver driver = DriverInit.setUpDriver();
        driver.get(Urls.guru);
        WebElement el5000 = driver.findElement(By.xpath("//*[@id='fourth']/a"));
        WebElement debitAmount = driver.findElement(By.xpath("//*[@id='amt7']/li"));
        Actions action = new Actions(driver);
        action.dragAndDrop(el5000, debitAmount).perform();

        WebElement another5000 = driver.findElement(By.xpath("//*[@id='fourth']/a"));
        WebElement creditAmount = driver.findElement(By.xpath("//*[@id='amt8']/li"));
        action.dragAndDrop(another5000, creditAmount).perform();

        WebElement bank = driver.findElement(By.xpath("//*[@id='credit2']/a"));
        WebElement sales = driver.findElement(By.xpath("//*[@id='credit1']/a"));
        WebElement debitAccount = driver.findElement(By.xpath("//*[@id='bank']/li"));
        WebElement creditAccount = driver.findElement(By.xpath("//*[@id='loan']/li"));
        action.dragAndDrop(bank, debitAccount).perform();
        action.dragAndDrop(sales, creditAccount).perform();

        WebElement perf = driver.findElement(By.cssSelector("#equal > a"));
        System.out.println(perf.getText());
        driver.close();
    }

}
