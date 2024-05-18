package hw1;

import driver_init.DriverInit;
import org.openqa.selenium.*;
import urls.Urls;

public class Task1 {
    /*Написати програму, яка буде відкривати чотири різні сторінки у нових вікнах.
    Прописати цикл, який перемикатиметься по черзі через всі сторінки,
     для кожної сторінки виводити в консоль назву та посилання на цю сторінку.
     І закриватиме ту сторінку у назві якої є слово зоопарк.
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverInit.setUpDriver();

        String[] urls = {Urls.schools, Urls.taxi, Urls.klopotenko, Urls.zoo};

        for (String url : urls) {
            driver.get(url);
            System.out.println(driver.getTitle());
            System.out.println(driver.getCurrentUrl());
            String title = driver.getTitle();
            if (title.toLowerCase().contains("зоопарк")) {
                driver.close();
            }else{
            driver.switchTo().newWindow(WindowType.WINDOW);}
        }

        /*WebElement closeButton = driver.findElement(By.className("spu-close spu-close-popup spu-close-top_right"));
        closeButton.click();*/

       /* driver.get(Urls.zoo);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.switchTo().newWindow(WindowType.WINDOW);

        driver.get(Urls.schools);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.switchTo().newWindow(WindowType.WINDOW);

        driver.get(Urls.taxi);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.switchTo().newWindow(WindowType.WINDOW);

        driver.get(Urls.klopotenko);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());


      for ( ) {
            driver.get();
            System.out.println(driver.getTitle());
            System.out.println(driver.getCurrentUrl());
            Thread.sleep(1000);
            driver.switchTo().newWindow(WindowType.WINDOW);
              String title = driver.getTitle();
       if (title.toLowerCase().contains("зоопарк")) {
            driver.close();
        }*/

    }
}
