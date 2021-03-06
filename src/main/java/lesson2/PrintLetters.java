package lesson2;

public class PrintLetters {
    private final int COUNT = 5;

    public synchronized void printLetterA() throws InterruptedException {

        for (int i = 0; i < COUNT; i++) {
            System.out.print("A");
            wait();
            Thread.sleep(1000);
            notify();
        }
    }

    public synchronized void printLetterB() throws InterruptedException {

        for (int i = 0; i < COUNT; i++) {
            System.out.print("B");
            wait();
            Thread.sleep(1000);
            notify();
        }
    }

    public synchronized void printLetterC() throws InterruptedException {

        for (int i = 0; i < COUNT; i++) {
            System.out.print("C");
            notify();
            Thread.sleep(1000);
            wait();
        }
    }
}
