//Создать пустой HashMap
//Поделить строку "мама мыла раму мыла" на слова и добавить в карту по принципу <индекс, слово>
//Проитерировать ключи карты
//Проитерировать значения карты
//Проитерировать комбинацию

package classwork.day8;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Map<Integer, String> myHashMap = new java.util.HashMap<>();
        String[] splitWords = "мама мыла раму мыла".split(" ");

        for (int i = 0; i < splitWords.length; i++) {
            myHashMap.put(2, splitWords[i]);
        }

        for (int key : myHashMap.keySet()) {
            System.out.println(key + " ");
        }

        for (String value : myHashMap.values()) {
            System.out.println(value + " ");
        }
        for (Map.Entry<Integer,String> entry:myHashMap.entrySet()){
            System.out.println(entry.getKey() + entry.getValue());
        }
    }
}
