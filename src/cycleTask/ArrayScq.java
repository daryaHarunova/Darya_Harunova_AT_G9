//каждый элемент массива возвести в квадрат и вывести результат в консоль

package cycleTask;

public class ArrayScq {
    public static void main(String[] args) {
        int [] array = {1,5,7,10,25};
        for (int i = 0; i < array.length; i++){
            array[i] = array[i] * array[i];
            System.out.print(array[i] + " ");
        }
        }
    }
