package lesson5;

import java.util.concurrent.Semaphore;

public class Tunnel extends Stage{
    Semaphore semaphore = new Semaphore(2); // Не более 2 машин в тоннеле;
    public Tunnel(){
        this.length = 80;
        this.description = "Тоннель " + length + " метров";
    }

    @Override
    public void go(Car c) {
        try {
            System.out.println(c.getName() + " готовится к этапу (ждет): " + description);
            semaphore.acquire();
            System.out.println(c.getName() + " начал этап: " + description);
            Thread.sleep(length / c.getSpeed() * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            System.out.println(c.getName() + " закончил этап " + description);
            semaphore.release();
        }
    }
}
