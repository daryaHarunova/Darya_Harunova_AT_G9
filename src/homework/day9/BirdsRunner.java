//Создать список строк birds из 5 птиц (Чайка, Дрозд, Бусел, Голубь, Воробей, Цапля) через (Arrays.asList())
//Создать из списка поток данных, заменить в каждую букву "о" на букву "а"
//Собрать все слова в одну строку в ниждем регистре
//Убрать все символы мягкого знака
//Разбить на новые строки по букве "б"
//Отпечатать в консоль с новой строки в виде --Чайка--

package homework.day9;

import java.util.Arrays;
import java.util.List;

public class BirdsRunner {
    public static void main(String[] args) {
        List<String> birds = Arrays.asList("Чайка", "Дрозд", "Бусел", "Голубь", "Воробей", "Цапля");
        birds.stream()
                .map(s -> s.replace("о", "а"))
                .map(String::toLowerCase)
                .map(s -> s.replace("ь", ""))
                .flatMap(s -> Arrays.stream(s.split("б")))
                .filter(s -> !s.equals(""))
                .forEach(s -> System.out.println("--" + s + "--"));

    }


}
