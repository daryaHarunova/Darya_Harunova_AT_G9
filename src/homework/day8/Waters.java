
package homework.day8;

import homework.day8.classes.Water;

import java.util.Arrays;
import java.util.List;

public class Waters {
    public static void main(String[] args) {
        List<Water> waterList = Arrays.asList(
                new Water("Прозрачная", "Нет"),
                new Water("Прозрачная", "Нет"),
                new Water("Мутная", "Аммиачный")
        );

//Проитерировать список через for-each и отпечатать пары цвет-вода через тире в консоль с новой строки

        for (Water water : waterList) {
            System.out.println(water.getColor() + "-" + water.getSmell());
        }
    }

}