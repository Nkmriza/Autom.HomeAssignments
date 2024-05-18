package hw1;

import driver_init.DriverInit;
import org.openqa.selenium.WebDriver;
import urls.Urls;

public class Task4 {
    /*Написати програму, яка повторює дію на відео "HW_AUTOMATION_LESSON_3_UPDATE.mp4".
http://www.automationpractice.pl/index.php*/
    public static void main(String[] args) {
        WebDriver driver = DriverInit.setUpDriver();
        driver.get(Urls.shop);
    }
}
