
package homework.day8;

import homework.day8.classes.Bubble;

import java.util.Arrays;
import java.util.List;

public class Bubbles {
    public static void main(String[] args) {
        List<homework.day8.classes.Bubble> bubbles = Arrays.asList(
                new Bubble(2, "CO2"),
                new Bubble(4, "O2"),
                new Bubble(5, "C0")
        );

        //Проитерировать список через for-each и отпечатать объемы в консоль через пробел

        for (Bubble bubble: bubbles){
            System.out.print(bubble.getVolume() + " ");
        }
//Проитерировать список через for-each и отпечатать имена в консоль через пробел

        for (Bubble bubble: bubbles) {
            System.out.print(bubble.getName() + " ");
        }
//Посчитать объем всех пузырей и вывести число в консоль

        int volumeAllBubbles = 0;
        for (Bubble bubble: bubbles) {
            volumeAllBubbles = volumeAllBubbles + bubble.getVolume();
        }
        System.out.println(volumeAllBubbles);

        //Проитерировать список по индексу и отпечатать пузыри (.toString()) в консоль с новой строки

        for (int i = 0; i < bubbles.size(); i++){
            System.out.println(bubbles.get(i).toString());
        }

    }

}