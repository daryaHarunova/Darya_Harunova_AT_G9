//найти минимальный элемент массива и вывести результат в консоль

package cycleTask;

public class ArrayMinElem {
    public static void main(String[] args) {
        int [] array = {1,5,2,10,0};
        int min = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println(min);
        }
    }
