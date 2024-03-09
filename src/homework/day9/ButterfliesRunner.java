//Создать пустой список стрингов butterflies (через new ArrayList)
//Добавить в список 4 бабочки (Common blue, Swallowtail, Aglais io, Common blue)
//Добавить к каждому элементу кавычки
//Оставить только те слова, которые содержат букву "a" и букву "о"
//Вывести слова в консоль с новой строки

package homework.day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ButterfliesRunner {
    public static void main(String[] args) {
        List<String> butterflies = new ArrayList<>();
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        butterflies.stream()
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .map(s -> "\"" + s + "\"")
                .filter(s -> s.contains("a") && s.contains("o"))
                .forEach(System.out::println);
    }
}
