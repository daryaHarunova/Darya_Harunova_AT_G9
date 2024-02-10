//поменять местами первый и последний элементы и вывести результат в консоль

package cycleTask;

public class ArrayChangePlace {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 10, 0};
        int firstElement = array[0];
        int lastElement = array[array.length - 1];
        array[0] = lastElement;
        array[array.length - 1] = firstElement;

        for (int element : array) {
            System.out.print(element);
        }
    }
}
