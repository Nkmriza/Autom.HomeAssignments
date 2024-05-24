package hw4.priority;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

/*1. Створити окремий пакет priority. У ньому клас Priority1.
У цьому класі створити тести a, b, c, d, e , f, g такого плану.
Зробити так, щоб при запуску даного класу ці тести проходили у порядку зворотному алфавітному.
Вигадати принаймні два способи, як це можна зробити.*/
public class Priority1 {
    @Test(priority = 7)
    public void a() {
        assertTrue(true);
    }

    @Test(priority = 6)
    public void b() {
        assertTrue(true);
    }

    @Test(priority = 5)
    public void c() {
        assertTrue(true);
    }

    @Test(priority = 4)
    public void d() {
        assertTrue(true);
    }

    @Test(priority = 3)
    public void e() {
        assertTrue(true);
    }

    @Test(priority = 2)
    public void f() {
        assertTrue(true);
    }

    @Test(priority = 1)
    public void g() {
        assertTrue(true);
    }

}
