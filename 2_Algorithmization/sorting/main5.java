import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class main5 {
    public static void main(String[] args) {
        int[] array = {10, 2, 1, 3, 1, 2, 5};
        Arrays.sort(array);

        for(var i : array){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println(binarySearch(array,5));

        insertionSort(array);
        System.out.println(Arrays.toString(array));

    }
    public static int binarySearch(int[] arr, int key) {
        int first = 0;
        int last = arr.length -1;

        while (first <= last){
            int mid = (first+ last) >>>1;
            int midArr = arr[mid];

            if(key > midArr){
                first = mid +1;
            }else if(key < midArr){
                last = mid-1;
            }else return mid;
        }
        return -(last+1);
    }

    public static void insertionSort(int[] sortArr) {
        int j;
        //сортировку начинаем со второго элемента, т.к. считается, что первый элемент уже отсортирован
        for (int i = 1; i < sortArr.length; i++) {
            //сохраняем ссылку на индекс предыдущего элемента
            int swap = sortArr[i];
            for (j = i; j > 0 && swap > sortArr[j - 1]; j--) {
                //элементы отсортированного сегмента перемещаем вперёд, если они больше элемента для вставки
                sortArr[j] = sortArr[j - 1];
            }
            sortArr[j] = swap;
        }
    }


}
