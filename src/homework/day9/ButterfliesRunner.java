package homework.day9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ButterfliesRunner {
    public static void main(String[] args) {
        List<String> butterflies = new ArrayList<>();
        butterflies.add("Common blue");
        butterflies.add("Swallowtail");
        butterflies.add("Aglais io");
        butterflies.add("Common blue");

        //Добавить к каждому элементу кавычки

        butterflies = butterflies.stream().map(s -> "\"" + s + "\"").collect(Collectors.toList());

        System.out.println(butterflies);

        //Оставить только те слова, которые содержат букву "a" и букву "о"

        butterflies = butterflies.stream().filter(s -> s.contains("a") && s.contains("o")).collect(Collectors.toList());

        System.out.println(butterflies);

        //Вывести слова в консоль с новой строки

        butterflies.forEach(System.out::println);

    }


}
