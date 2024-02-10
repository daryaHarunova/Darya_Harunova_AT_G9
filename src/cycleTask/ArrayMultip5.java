//каждый элемент массива умножить на 5 и вывести результат в консоль

package cycleTask;

public class ArrayMultip5 {
    public static void main(String[] args) {
        int[] array = {1, 5, 7, 10, 25};
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * 5;
            System.out.print(array[i] + " ");
        }
    }
}
