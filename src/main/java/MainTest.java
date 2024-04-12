import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest extends Main{


    @Test
    public void task1() {
        assertEquals("Wrong", Main.task1(1));
    }

    @Test
    public void task1_2() {
        assertEquals("Right", Main.task1(0));
    }
    @Test
    public void task1_3() {
        assertEquals("Wrong", Main.task1(0));
    }


    @Test
    public void task2() {
        assertEquals("Wrong", Main.task2(1));
    }

    @Test
    public void task2_2() {
        assertEquals("Right", Main.task2(0));
    }
    @Test
    public void task2_3() {
        assertEquals("Wrong", Main.task2(0));
    }


    @Test
    public void task3() {
        assertEquals("Wrong", Main.task3(1));
    }

    @Test
    public void task3_2() {
        assertEquals("Right", Main.task3(0));
    }
    @Test
    public void task3_3() {
        assertEquals("Wrong", Main.task3(0));
    }

    @Test
    public void task4() {
        assertEquals("Wrong", Main.task4(1));
    }

    @Test
    public void task4_2() {
        assertEquals("Right", Main.task4(0));
    }
    @Test
    public void task4_3() {
        assertEquals("Wrong", Main.task4(0));
    }

    @Test
    public void task5() {
        assertEquals("Wrong", Main.task5(1));
    }

    @Test
    public void task5_2() {
        assertEquals("Right", Main.task5(0));
    }
    @Test
    public void task5_3() {
        assertEquals("Wrong", Main.task5(0));
    }

    @Test
    public void task6() {
        assertEquals("Wrong", Main.task6(1));
    }

    @Test
    public void task6_2() {
        assertEquals("Right", Main.task6(0));
    }
    @Test
    public void task6_3() {
        assertEquals("Wrong", Main.task6(0));
    }

    @Test
    public void task7() {
        assertEquals("Wrong", Main.task7("test"));
    }

    @Test
    public void task7_2() {
        assertEquals("Right", Main.task7("тест"));
    }
    @Test
    public void task7_3() {
        assertEquals("Wrong", Main.task7("3"));
    }

    @Test
    public void task8() {
        assertEquals("Wrong", Main.task8("1"));
    }

    @Test
    public void task8_2() {
        assertEquals("Right", Main.task8("1"));
    }
    @Test
    public void task8_3() {
        assertEquals("Wrong", Main.task8("3"));
    }

    @Test
    public void task9(){
        assertEquals("Right", Main.task9(true));
    }
    @Test
    public void task9_2(){
        assertEquals("Wrong", Main.task9(false));
    }





}
