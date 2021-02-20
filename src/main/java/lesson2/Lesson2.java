package lesson2;

public class Lesson2 {
    /**
     * Создать три потока, каждый из которых выводит определенную букву (A, B и C) 5 раз
     * (порядок – ABСABСABС). Используйте wait/notify/notifyAll.
     */

    public static int COUNT = 5;


    public static void main(String[] args) {

        // Первый поток
        new Thread(() -> {
            for (int i = 0; i < COUNT; i++) {
                System.out.print("A");
            }

        }).start();

        // Второй поток
        new Thread(() -> {
            for (int i = 0; i < COUNT; i++) {
                System.out.print("B");
            }
        }).start();


        // Третий поток
        new Thread(() -> {
            for (int i = 0; i < COUNT; i++) {
                System.out.print("C");
            }
        }).start();
    }


}

