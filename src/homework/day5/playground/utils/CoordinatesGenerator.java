package homework.day5.playground.utils;

import java.util.Random;

public class CoordinatesGenerator {
    public static int generateCoordinate() {
        int number = new Random().nextInt(80);
        System.out.println("CoordinatesGenerator: I have generated point with value:" + number);
        return number;
    }

}
