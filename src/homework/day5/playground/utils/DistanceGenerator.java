package homework.day5.playground.utils;

import java.util.Random;

public class DistanceGenerator {
    public static int generateDistance()  {
        int value = new Random().nextInt(100);
        System.out.println("DistanceGenerator: I have generated distance with value:" + value);
        return value;
    }

}
