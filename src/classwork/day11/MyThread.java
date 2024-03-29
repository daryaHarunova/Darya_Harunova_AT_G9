package classwork.day11;

import static java.lang.Math.atan;
import static java.lang.Math.tan;

public class MyThread {
    public static void main(String[] args) {


        //строчка за строчкой (общее время - сумма всех времен)

//        for (int i =0; i<5; i++){
//            heavyMethod();
//        }

        //все строчки одновременно выводит все строчки (время каждого становится больше, но общее время становится меньше)

        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                heavyMethod();
            }).start();

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
