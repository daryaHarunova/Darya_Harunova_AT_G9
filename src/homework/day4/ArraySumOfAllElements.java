// написать метод, который принимает на вход целочисленном массив и считает сумму каждого n-ого элемента в нем,
// где n - целое число, передаваемое в сигнатуру этого метода

package homework.day4;

public class ArraySumOfAllElements {
    public int findCurrentDay(int[] array) {
        int currentDay = 13;

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % currentDay == 0) {
                sum = sum + array[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int [] array = {1,2,5,8,9,10,12,13,26};
        ArraySumOfAllElements newArraySumOfAllElements = new ArraySumOfAllElements();
        newArraySumOfAllElements.findCurrentDay(array);
        System.out.println(newArraySumOfAllElements.findCurrentDay(array));

    }

}



