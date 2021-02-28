package lesson6;

import java.util.Arrays;

public class Lesson6 {
    /**
     * 2. Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив.
     * Метод должен вернуть новый массив, который получен путем вытаскивания из исходного массива элементов,
     * идущих после последней четверки.
     * Входной массив должен содержать хотя бы одну четверку, иначе в методе
     * необходимо выбросить RuntimeException. Написать набор тестов для этого метода (по 3-4 варианта входных данных).
     * Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].
     * 3. Написать метод, который проверяет состав массива из чисел 1 и 4. Если в нем нет хоть одной четверки или единицы,
     * то метод вернет false; Написать набор тестов для этого метода (по 3-4 варианта входных данных).
     */

    public static void main(String[] args) {
        // index       0  1  2  3  4  5  6  7  8
        int[] array = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        divideArray(array);
        System.out.println("++++++++++++++++++++++++++");
        int[] array2 = {1, 4, 4};
        System.out.println(checkArray(array2));


    }

    public static int[] divideArray(int[] array) {
        System.out.println("Входной массив: " + Arrays.toString(array));
        int index = -1;
        for (int i = array.length - 1; i >= 0; i--) { // Обход справа налево
            if (array[i] == 4) {
                index = i; // Выцепляем индекс в текущем массиве (6)
                break;
            }
        }
        if (index == -1) {
            throw new RuntimeException("Число 4 отсутствует");
        }
        int[] newArray = new int[array.length - 1 - index]; // Создаем массив размерностью 9(array.length - 1 - 6(index) = 2
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[index + 1];  // Присваиваем значения индексов 7
            index++;  // и 8
        }
        System.out.println("Новый массив: " + Arrays.toString(newArray));
        return newArray;
    }

    public static boolean checkArray(int[] array2) {
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] != 1 && array2[i] != 4) {
                return false;
            }
        }
        int firstElement = array2[0];

        for (int i = 0; i < array2.length; i++) {
            if (array2[i] != firstElement) {
                return true;
            }
        }
        return false;

    }

}
