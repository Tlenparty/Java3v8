package lesson6.text;

import lesson6.Lesson6;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CheckArrayTest {
    /**
     *  Написать метод, который проверяет состав массива из чисел 1 и 4. Если в нем нет хоть одной четверки или единицы,
     *      * то метод вернет false; Написать набор тестов для этого метода (по 3-4 варианта входных данных).
     */
    @Test
    public void testCheckArray1(){
        Assertions.assertTrue(Lesson6.checkArray(new int []{1,4,1}));
    }

    @Test
    public void testCheckArray2(){
        Assertions.assertTrue(Lesson6.checkArray(new int []{1,1,1}));
    }

    @Test
    public void testCheckArray3(){
        Assertions.assertFalse(Lesson6.checkArray(new int []{4,4,4}));
    }

    @Test
    public void testCheckArray4(){
        Assertions.assertFalse(Lesson6.checkArray(new int []{-1,4,1}));
    }


}