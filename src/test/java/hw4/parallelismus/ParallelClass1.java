package hw4.parallelismus;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ParallelClass1 {
    /*Створити окремий пакет parallelismus. У ньому клас ParallelClass1.
    В якому створити тести parallel1, parallel2, parallel3, parallel4, parallel5.
    Створити клас ParallelClass2. В якому створити тести parallel6, parallel7,
    parallel8, parallel9, parallel10.
    Створити окремий xml файл testngParallelHome.xml
    у якому паралельно будуть проганятися вище створені два класи
     ParallelClass1 та ParallelClass2.*/
    @Test
    public void parallel1() throws InterruptedException {
        Thread.sleep(2000);
        assertTrue(true);
    }

    @Test
    public void parallel2() throws InterruptedException {
        Thread.sleep(2000);
        assertTrue(true);
    }

    @Test
    public void parallel3() throws InterruptedException {
        Thread.sleep(2000);
        assertTrue(true);
    }

    @Test
    public void parallel4() throws InterruptedException {
        Thread.sleep(2000);
        assertTrue(true);
    }

    @Test
    public void parallel5() throws InterruptedException {
        Thread.sleep(2000);
        assertTrue(true);
    }
}
