//Создать поток данных стрингов countries из 4 стран (Андора, Португалия, Англия, Замбия) (через Stream.of())
//Отфильтровать страны, которые содержат в себе хотя бы одну гласную букву
//Отфильтровать страны, в названии которых меньше 7 букв
//Перевести все страны в верхний регистр
//Добавить к каждому названию кавычки
//Отпечатать в консоль с новой строки

package homework.day9;

import java.util.List;
import java.util.stream.Stream;

public class CountriesRunner {
    public static void main(String[] args) {
        List<String> countries = Stream.of("Андора", "Португалия", "Англия", "Замбия").toList();

        countries.stream()
                .filter(s -> s.toLowerCase().matches(".*[аеёиоуыюя].*"))
                .filter(s -> s.length() < 7)
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
