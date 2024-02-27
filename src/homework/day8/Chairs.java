
package homework.day8;

import homework.day8.classes.Bubble;
import homework.day8.classes.Chair;
import homework.day8.classes.Sand;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Chairs {
    public static void main(String[] args) {
        List<Chair> furniture  = Arrays.asList(
                new Chair(1, 2),
                new Chair(4, 2),
                new Chair(2, 4)
        );

      //Проитерировать список через for-each и отпечатать произведение высоты на ширину в консоль через пробел

      for (Chair chair: furniture ){
          System.out.print(chair.getHeight() * chair.getWidth() + " ");
      }
      //Создать пустую карту, где ключом является целое число, а значением объект стула

        Map<Integer,Chair> myHashMap = new HashMap<>();

      //Заполнить карту значениями из предыдущего списка, используя в качестве ключа любое уникальное число

        for (int i = 0; i < furniture .size(); i++){
            myHashMap.put(i, furniture .get(i));
        }
        System.out.println(myHashMap);

        //Проитерировать карту и отпечатать ключи в консоль

        for (int key: myHashMap.keySet()){
            System.out.println(key);
        }

        //Проитерировать карту и отпечатать значения в консоль

        for (Chair value: myHashMap.values()){
            System.out.println(value);
        }

        //Проитерировать карту и отпечатать пары ключ-значение в консоль

        for(Map.Entry<Integer, Chair>entry:myHashMap.entrySet()){
            System.out.println(entry);

        }
    }

}