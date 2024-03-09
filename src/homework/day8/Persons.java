
package homework.day8;

import homework.day8.classes.Person;

import java.util.ArrayList;
import java.util.List;

public class Persons {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person(32, "Коля"));
        people.add(new Person(24, "Оля"));
        people.add(new Person(55, "Вася"));
        people.add(new Person(63, "Маша"));

        //Проитерировать список через for-each и отпечатать возраст в консоль через пробел

        for (Person person : people) {
            System.out.print(person.getAge() + " ");
        }

        //Проитерировать список через for-each и отпечатать имена в консоль через пробел

        for (Person person : people) {
            System.out.print(person.getName() + " ");
        }

        //Проитерировать список по индексу и отпечатать людей (.toString()) в консоль с новой строки

        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).toString());
        }


    }

}