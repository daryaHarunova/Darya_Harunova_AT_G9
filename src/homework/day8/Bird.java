package homework.day8;

import java.util.Arrays;
import java.util.List;

public class Bird {
    public static void main(String[] args)  {
        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");

        //Проитерировать список через for-each и отпечатать слова в консоль с новой строки в виде --Чайка--

        for (String bird : birds) {
            System.out.println("--" + bird + "--");
        }

        //Посчитать сколько птиц содержат больше 1 гласной и вывести в число в консоль

        //Проитерировать список по индексу и отпечатать слова в консоль через пробел

        for (int i = 0; i < birds.size(); i++) {
            System.out.print(birds.get(i) + " ");
        }

        //Заменить 3-й элемент списка на Синица

        birds.set(3, "Синица");
        System.out.println(birds);


        //Проитерировать список через for-each и отпечатать слова в консоль через пробел

        for (String bird : birds) {
            System.out.print(bird + " ");
        }
    }
}
