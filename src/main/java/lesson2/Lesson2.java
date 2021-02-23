package lesson2;

public class Lesson2 {
    /**
     * Создать три потока, каждый из которых выводит определенную букву (A, B и C) 5 раз
     * (порядок – ABСABСABС). Используйте wait/notify/notifyAll.
     */




    public static void main(String[] args) {
        PrintLetters printLetters = new PrintLetters();

        // Первый поток
        new Thread(() -> {
            try {
                printLetters.printLetterA();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        // Второй поток
        new Thread(() -> {
            try {
                printLetters.printLetterB();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();


        // Третий поток
        new Thread(() -> {
            try {
                printLetters.printLetterC();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }


}

