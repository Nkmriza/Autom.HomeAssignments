package hw4.grouping;

import driver_init.DriverInit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class Groups {
    /*Створити окремий пакет grouping. У ньому клас Groups.
    У цьому класі створити тести one, two, three, four, five, six, seven, eight
    Зробити те щоб тести, які називаються непарними числами належали групі first,
    а тести парних чисел належали групі second. Створити окремий xml файл
    testngGroupingHome.xml у якому послідовно проганялися спочатку файли групи first,
    а потім файли групи second. P.S. У кожній групі тести мають відбуватися у порядку зростання.*/
    static WebDriver driver;
    @BeforeClass(groups = {"first", "second"})
    public void setUp() {
        driver = DriverInit.setUpDriver();
    }

    @AfterClass(groups = {"first", "second"})
    public void stop() {
        driver.quit();
    }

    @Test(groups = {"first"}, priority = 1)
    public void one() {
        assertTrue(true);
    }

    @Test(groups = {"second"}, priority = 1)
    public void two() {
        assertTrue(true);
    }

    @Test(groups = {"first"}, priority = 2)
    public void three() {
        assertTrue(true);
    }

    @Test(groups = {"second"}, priority = 2)
    public void four() {
        assertTrue(true);
    }

    @Test(groups = {"first"}, priority = 3)
    public void five() {
        assertTrue(true);
    }

    @Test(groups = {"second"}, priority = 3)
    public void six() {
        assertTrue(true);
    }

    @Test(groups = {"first"}, priority = 4)
    public void seven() {
        assertTrue(true);
    }

    @Test(groups = {"second"}, priority = 4)
    public void eight() {
        assertTrue(true);
    }
}