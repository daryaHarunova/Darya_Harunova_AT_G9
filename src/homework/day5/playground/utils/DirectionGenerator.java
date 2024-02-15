package homework.day5.playground.utils;

import java.util.Random;

public class DirectionGenerator {
    public static String generateDirection() {
        int random = new Random().nextInt(40);
        if (random <= 9 && random >= 1) {
            return "NORTH";
        } else if (random <= 19 && random >= 10) {
            return "SOUTH";
        } else if (random <= 29 && random >= 20) {
            return "WEST";
        } else {
            return "EAST";
        }
    }
}
