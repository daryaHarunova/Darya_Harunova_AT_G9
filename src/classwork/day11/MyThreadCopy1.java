package classwork.day11;

import static java.lang.Math.atan;
import static java.lang.Math.tan;

public class MyThreadCopy1 {
    public static void main(String[] args) throws InterruptedException {

        // очередность выполнения ( до старта - создается новый поток и делать цикл for > после старта> main запускает цикл for и параллельно Thread (лругая вселенная, for в нем никак не связан с main)

        new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                try {
                    Thread.currentThread().sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.printf("t1-%s  ", i);
            }
        }).start();
        for (int i = 0; i < 3; i++) {
            Thread.currentThread().sleep(1000);
            System.out.printf("m-%s  ", i);
        }

    }

    //метод с ресурсоемкими вычислениями
    public static void heavyMethod() {
        long t0 = System.currentTimeMillis();
        for (int i = 0; i < 1_00_000_000; i++) {
            double d = tan(atan(123456789.123456789));
        }
        System.out.printf("I am %s, and I have finished in %s millis \r\n",
                Thread.currentThread().getName(),
                (System.currentTimeMillis() - t0));
    }
}
