//- создать абстрактный класс Water
//- у воды есть такие характеристики, цвет, прозрачность, запах, температура

package project.boxing;

import project.Bubble;
import project.SparklingWater;

public class Bottle {
    private double volume;
    private SparklingWater water;

    public Bottle(double volume) {
        this.volume = volume;
        int n = (int) (volume * 10000);
        Bubble[] bubbles = new Bubble[n];
        for (int i = 0; i < n; i++) {
            bubbles[i] = new Bubble("CO2");
        }
        this.water = new SparklingWater();
        water.pump(bubbles);
    }

    public void open() {
        water.degas();
    }
}
