
package homework.day8;

import homework.day8.classes.Person;

import java.util.ArrayList;
import java.util.List;

public class Persons {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person(32, "Коля"));
        persons.add(new Person(24, "Оля"));
        persons.add(new Person(55, "Вася"));
        persons.add(new Person(63, "Маша"));

        //Проитерировать список через for-each и отпечатать возраст в консоль через пробел

        for (Person person : persons) {
            System.out.print(person.getAge() + " ");
        }

        //Проитерировать список через for-each и отпечатать имена в консоль через пробел

        for (Person person : persons) {
            System.out.print(person.getName() + " ");
        }

        //Проитерировать список по индексу и отпечатать людей (.toString()) в консоль с новой строки

        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i).toString());
        }


    }

}