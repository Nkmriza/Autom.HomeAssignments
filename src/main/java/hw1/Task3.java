package hw1;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

public class Task3 {
/* Написати метод який виводить повідомлення про ID елемента,
значення тега елемента, значення класу елемента, значення атрибута name
елемента, тексту даного елемента, а також координати центру контейнера даного елемента.
 */

    public void infoAboutElement (WebElement ElementInfo){
        String elID = ElementInfo.getAttribute("id");
        String tagName = ElementInfo.getTagName();
        String className = ElementInfo.getAttribute("class");
        String attr = ElementInfo.getAttribute("name");
        String text = ElementInfo.getText();

        int centreX = ElementInfo.getLocation().x + ElementInfo.getSize().width/2;
        int centreY = ElementInfo.getLocation().y + ElementInfo.getSize().height/2;

        Point coordinates = new Point(centreX, centreY);


        System.out.println("ID елемента: " + elID);
        System.out.println("Тег елемента: " + tagName);
        System.out.println("Клас елемента: " + className);
        System.out.println("Атрибут елемента: " + attr);
        System.out.println("Текст елемента: " + text);
        System.out.println("Координати центру контейнера елементу: " + coordinates);
    }
}
