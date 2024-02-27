package homework.day8;

import java.util.Arrays;
import java.util.List;

public class Bird {
    public static void main(String[] args) {
        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");

        //Проитерировать список через for-each и отпечатать слова в консоль с новой строки в виде --Чайка--

        for (String bird : birds) {
            System.out.println("--" + bird + "--");
        }

        //Посчитать сколько птиц содержат больше 1 гласной и вывести в число в консоль
        String vowel = "аеёиоуыэюя";
        for (String bird : birds) {
            char[] arr = bird.toCharArray();
            int countVowel = 0;
            for (char bukva : arr) {
                if (vowel.contains(String.valueOf(bukva))) {
                    countVowel++;
                }
            }
            if (countVowel > 1) {
                System.out.println("Птица " + bird + " имеет " + countVowel + " гласных");
            }
        }

        //Проитерировать список по индексу и отпечатать слова в консоль через пробел

        for (int i = 0; i < birds.size(); i++) {
            System.out.print(birds.get(i) + " ");
        }

        //Заменить 3-й элемент списка на Синица

        birds.set(2, "Синица");
        System.out.println(birds);


        //Проитерировать список через for-each и отпечатать слова в консоль через пробел

        for (String bird : birds) {
            System.out.print(bird + " ");
        }
    }
}
