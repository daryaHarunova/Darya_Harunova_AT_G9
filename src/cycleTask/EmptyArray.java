//создать пустой массив типа int и размера n = 7 и заполнить его случайными элементами используя Random.nextInt

package cycleTask;

import java.util.Random;

public class EmptyArray {
    public static void main(String[] args) {
        Random random = new Random();
        int [] array = new int [7];
        for (int i = 0; i <= array.length -1; i++){
            array[i] = random.nextInt();

        }
        for (int i: array){
            System.out.print(i);
        }
    }
    }



