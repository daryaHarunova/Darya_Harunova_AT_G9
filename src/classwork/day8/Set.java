//Создать пустой сет
//Поделить строку "мама мыла раму мыла" на слова и добавить в список
//Проитерировать список 2-мя способами (через итератор и for-each) и отпечатать слова в консоль

package classwork.day8;

import java.util.*;

public class Set {
    public static void main(String[] args) {
        java.util.Set<String> mySet = new HashSet<>();
        String[] splitWords = "мама мыла раму мыла".split(" ");
        for (String string : splitWords) {
            mySet.add(string);
        }
        Iterator<String> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (String words : mySet) {
            System.out.println(words);
        }

    }
}
