package classwork.day10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),
                new Person("Катя", 12, Person.Sex.WOMEN),
                new Person("Вова", 24, Person.Sex.MAN),
                new Person("Маша", 38, Person.Sex.WOMEN),
                new Person("Роман Петрович", 72, Person.Sex.MAN));

        //Отсортировать коллекцию строк по алфавиту

        people.stream()
                .map(Person::getName)
                .sorted()
                .forEach(System.out::println);

        //Отсортировать коллекцию строк по алфавиту в обратном порядке и убрать дубликаты

        people.stream()
                .map(Person::getName)
                .sorted((s1,s2) -> -s1.compareTo(s2))
                .distinct()
                .forEach(System.out::println);

        //Отсортировать коллекцию людей сначала по полу, а потом по возрасту, вывести результат в консоль и вернуть результирующую коллекцию

        people.stream()
                .sorted(Comparator.comparing(Person::getSex).thenComparing(Person::getAge))
                .peek(System.out::println)
                .collect(Collectors.toList());
    }
}
