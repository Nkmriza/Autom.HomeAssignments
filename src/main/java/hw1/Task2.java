package hw1;

import org.openqa.selenium.WebElement;

import javax.lang.model.element.Element;

public class Task2 {
    /*2) Написати метод до параметрів якого приймаються два ВебЕлементи:
метод виводить у консоль інформацію який із двох елементів розташовується
 вище на сторінці, який з елементів розташовується ліворуч на сторінці, а
 також який із елементів займає велику площу. Параметри методу можуть також
  включати інші аргументи, якщо це необхідно.
     */
    public void infoAboutElements (WebElement element1, WebElement element2) {
        int xEl1 = element1.getLocation().x;
        int xEl2 = element2.getLocation().x;

        if (xEl1 < xEl2) {
            System.out.println("Перший елемент" + element1.getText() + "розташований ліворуч на сторінці");
        } else if (xEl1 > xEl2) {
            System.out.println("Другий елемент" + element2.getText() + "розташований ліворуч на сторінці");
        } else {
            System.out.println("Елементи розташовані паралельно:)");
        }

        int yEl1 = element1.getLocation().y;
        int yEl2 = element2.getLocation().y;

        if (yEl1 < yEl2) {
            System.out.println("Перший елемент" + element1.getText() + "розташований вище на сторінці");
        } else if (yEl1 > yEl2) {
            System.out.println("Другий елемент" + element2.getText() + "розташований вище на сторінці");
        } else {
            System.out.println("Елементи розташовані паралельно:)");
        }


        int widthEl1 = element1.getSize().width;
        int heightEl1 = element1.getSize().height;
        int S1 = widthEl1 * heightEl1;

        int widthEl2 = element2.getSize().width;
        int heightEl2 = element2.getSize().height;
        int S2 = widthEl2 * heightEl2;

        if (S1 > S2) {
            System.out.println("Перший елемент" + element1.getText() + "займає більшу площу");
        } else if (S1 < S2) {
            System.out.println("Другий елемент" + element2.getText() + "займає більшу площу");
        } else {
            System.out.println("Елементи однакові за площею");
        }

    }
}
