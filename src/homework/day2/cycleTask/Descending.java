//создать пустой массив типа int и размера n = 7 и заполнить его случайными элементами используя Random.nextInt

package homework.day2.cycleTask;

import java.util.Arrays;

public class Descending {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 7};

        Arrays.sort(array);

        for (int i = 0; i < array.length / 2; i++) {
            int newArray = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = newArray;
        }

        System.out.println(Arrays.toString(array));
    }
}



