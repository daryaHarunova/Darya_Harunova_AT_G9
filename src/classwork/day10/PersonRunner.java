//Найти кол-во потенциально работоспособных
//людей в выборке (18 - 55 лет (женщины), 60 лет
//(мужчины))

package classwork.day10;

import java.util.Arrays;
import java.util.List;

public class PersonRunner {
    public static void main(Task[] args) {
        List<Person> people = Arrays.asList(
                new Person("Вася", 13, Person.Sex.MAN),

                new Person("Катя", 28, Person.Sex.WOMEN),

                new Person("Вова", 24, Person.Sex.MAN),

                new Person("Маша", 38, Person.Sex.WOMEN),

                new Person("Роман Петрович", 72, Person.Sex.MAN));
        System.out.println(
                people.stream().filter(s -> (s.age >= 18 && s.age <= 55 && s.getSex() == Person.Sex.WOMEN) || (s.age >= 18 && s.age <= 60 && s.getSex() == Person.Sex.MAN))
                        .count());


    }

}
