package lesson6.text;

import lesson6.Lesson6;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideTest {
    /**
     * Написать набор тестов для этого метода (по 3-4 варианта входных данных).
     */
    @Test
    public void testDivideArray1(){
        // assertions - утверждения
        //Слева то, что ожидается, справа значение которое готовы отдать с помощью метода
        Assertions.assertArrayEquals(new int[]{5, 6, 7, 8}, Lesson6.divideArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8 }));
    }

    @Test
    public void testDivideArray2(){
        Assertions.assertArrayEquals(new int[]{1, 3, 7, -10}, Lesson6.divideArray(new int[]{1, 2, 3, 4, 1, 3, -10, 7 }));
    }

    @Test
    public void testDivideArray3(){
        Assertions.assertArrayEquals(new int[]{1, -1}, Lesson6.divideArray(new int[]{1, 2, 3, 4, 1, -1 }));
    }


}