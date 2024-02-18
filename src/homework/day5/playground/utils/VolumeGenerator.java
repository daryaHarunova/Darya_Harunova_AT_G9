package homework.day5.playground.utils;

import homework.day5.playground.essence.material.Diesel;
import homework.day5.playground.essence.material.Petrol;
import homework.day5.playground.essence.material.Pourable;
import homework.day5.playground.essence.material.Water;

import java.util.Random;

public class VolumeGenerator {
    public static int generateVolume(Pourable pourable) {
        int value = 0;
        if (pourable instanceof Diesel || pourable instanceof Petrol) {
            value = new Random().nextInt(50);
            return value;
        } else if (pourable instanceof Water) {
            value = new Random().nextInt(51) + 50;
        }
        System.out.println(String.format("VolumeGenerator: I have generated volume of %s with value:" + value, pourable.getClass().getSimpleName()));
        return value;
    }
}
