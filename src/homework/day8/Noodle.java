package homework.day8;

import java.util.ArrayList;
import java.util.List;

public class Noodle {
    public static void main(String[] args) {
        List<String> noodles = new ArrayList<>();

        noodles.add("Hakka");
        noodles.add("Ramen");
        noodles.add("Hibachi");
        noodles.add("Schezwan");

//Проитерировать список через for-each и отпечатать слова в консоль через тире

        System.out.println("Task1");
        for (String noodle : noodles) {
            if (noodles.indexOf(noodle) == noodles.size() - 1) {
                System.out.print(noodle);
            } else {
                System.out.print(noodle + "-");
            }
        }

        //Заменить в каждом слове буквы "а" на букву "о"

        List<String> noodles1 = new ArrayList<>();
        System.out.println("Task2");
        for (String noodle : noodles) {
            String newString = noodle.replace("a", "o");
            noodles1.add(newString);
        }
        System.out.println(noodles1);

        //Проитерировать список по индексу и отпечатать слова в консоль через пробел

        for (int i = 0; i < noodles.size(); i++) {
            System.out.print(noodles.get(i) + " ");
        }


    }
}
