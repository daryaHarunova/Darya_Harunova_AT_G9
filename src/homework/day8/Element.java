package homework.day8;

import java.util.ArrayList;
import java.util.List;

public class Element {
    public static void main(String[] args) {
        List<String> elements = new ArrayList<>();

        elements.add("Text field");
        elements.add("Radio");
        elements.add("Check-box");
        elements.add("Drop-down");
        elements.add("Picker");
        elements.add("Breadcrumb");

        //Проитерировать список через for-each и отпечатать слова в консоль через пробел

        for (String element: elements){
            System.out.print(element + " ");
        }
        //Посчитать сколько названий элементов состоит более, чем из одного слова и вывести число в консоль

        int count = 0;
        for (String element : elements) {
            if (element.contains(" ") || element.contains("-")) {
                count++;
            }
        }
        System.out.println("\n" + count);

        //Проитерировать список по индексу и отпечатать слова в консоль через пробел

        for (int i = 0; i < elements.size(); i++){
            System.out.print(elements.get(i) + " ");
        }

        //На 4-ю позицию добавить Spinner

        elements.add(4, "Spinner");
        System.out.println("\n" + elements);

        //Удалить 2-й элемент списка

        elements.remove(2);
        System.out.println(elements);

        //Заменить 5-й элемент на Switch

        elements.set(5, "Switch");
        System.out.println(elements);

        //Проитерировать список через for-each и отпечатать слова в консоль через пробел

        for (String element: elements){
            System.out.print(element + " ");
        }

    }

}