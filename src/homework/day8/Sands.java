
package homework.day8;

import homework.day8.classes.Sand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sands {
    public static void main(String[] args) {
        List<Sand> sands = new ArrayList<>();

        sands.add(new Sand(2, "Речной"));
        sands.add(new Sand(4, "Речной"));
        sands.add(new Sand(2, "Карьерный"));
        sands.add(new Sand(7, "Речной"));

        //Проитерировать список через for-each и отпечатать вес в консоль через пробел

        for (Sand sand : sands) {
            System.out.print(sand.getMass() + " ");
        }

        //Проитерировать список через for-each и отпечатать имена в консоль через пробел

        for (Sand sand : sands) {
            System.out.print(sand.getName() + " ");
        }
        //Создать пустую карту, где ключом является целое число, а значением объект песка

        Map <Integer, Sand> myHashMap = new HashMap<>();

        //Заполнить карту значениями из предыдущего списка, используя в качестве ключа любое уникальное число

        for (int i = 0; i < sands.size(); i++){
            myHashMap.put(i, sands.get(i));
        }
        System.out.println(myHashMap);

        //Проитерировать карту и отпечатать ключи в консоль

        for(int key: myHashMap.keySet()){
            System.out.println(key);
        }

        //Проитерировать карту и отпечатать значения в консоль

        for (Sand value: myHashMap.values()){
            System.out.println(value);
        }

        //Проитерировать карту и отпечатать пары ключ-значение в консоль

        for(Map.Entry<Integer, Sand> entry: myHashMap.entrySet()){
            System.out.println(entry.getKey() + entry.getValue().toString());
        }
    }
}