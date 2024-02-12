// написать метод, который принимает на вход целочисленном массив и считает сумму каждого n-ого элемента в нем,
// где n - целое число, передаваемое в сигнатуру этого метода

package homework.day4;

public class ArraySum {
    public int calculateSum(int[] array, int n) {
        int sum = 0;
        for (int i = n - 1; i < array.length; i = i+n) {
            sum = sum + array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        ArraySum sum = new ArraySum();
        int [] array = {1,2,5,9,7};
        System.out.println(sum.calculateSum(array, 3));
    }
}

