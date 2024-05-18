package hw2;

import driver_init.DriverInit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import urls.Urls;

public class Task1 {
    /*1) http://only-testing-blog.blogspot.com/2014/01/textbox.html?
Написати програму, яка реалізує дію, показану на "видео1.mp4". Після виконання програми на
консолі має виводитись інформація в наступному вигляді:
Автомобілі доступні для вибору:
Volvo, BMW, Opel, Audi, Toyota, Renault, Maruti Car.
Країни з першої таблиці:
USA, Russia, Japan, Mexico, India, Malaysia, Greece.
Країни з другої таблиці:
France, Germany, Italy, Spain.*/
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = DriverInit.setUpDriver();
        driver.get(Urls.blogpost);
        WebElement elementCar = driver.findElement(By.id("Carlist"));
        Select car = new Select(elementCar);
        car.selectByVisibleText("Renault");
        Thread.sleep(1000);
        WebElement countries = driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/form[2]/table/tbody/tr/td[1]/select"));
        Select country = new Select(countries);
        country.selectByVisibleText("France");
        country.selectByVisibleText("India");
        Thread.sleep(1000);
        country.deselectByVisibleText("India");
        country.selectByVisibleText("Germany");
        country.selectByVisibleText("Italy");
        country.selectByVisibleText("Malaysia");
        Thread.sleep(1000);
        country.deselectByVisibleText("Malaysia");
        country.selectByVisibleText("Spain");
        WebElement selection = driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/form[2]/table/tbody/tr/td[2]/input[1]"));
        selection.click();
        WebElement countries2 = driver.findElement(By.xpath("//*[@id='post-body-4292417847084983089']/div[1]/form[2]/table/tbody/tr/td[3]/select"));
        System.out.println("Автомобілі доступні для вибору:" + elementCar.getText().replace("\n", ", "));
        System.out.println("Країни з першої таблиці: " + countries.getText().replace("\n", ", "));
        System.out.println("Країни з другої таблиці: " + countries2.getText().replace("\n", ", "));
        driver.quit();

    }

}
