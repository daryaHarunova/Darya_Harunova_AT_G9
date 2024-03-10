package classwork.day11;

import static java.lang.Math.atan;
import static java.lang.Math.tan;

public class MyThreadCopy {
    public static void main(String[] args) throws InterruptedException {

        // разделяем 3 потока (получается тоже самое, но чуть быстрее, т.к. потоки разделены)

//        Thread t1 = new Thread(() -> heavyMethod());
//        Thread t2 = new Thread(() -> heavyMethod());
//        Thread t3 = new Thread(() -> heavyMethod());
//
//        t1.start();
//        t2.start();
//        t3.start();


//        //по очереди (параллельно работают star t1 и join t1, т.е. не переходит на t2)
//
//        Thread t1 = new Thread(() -> heavyMethod());
//        Thread t2 = new Thread(() -> heavyMethod());
//        Thread t3 = new Thread(() -> heavyMethod());
//
//        t1.start();
//        t1.join();
//        t2.start();
//        t2.join();
//        t3.start();
//        t3.join();
//    }


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
