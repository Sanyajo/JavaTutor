import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class main3 {
    public static void main(String[] args) {
        int[] array = {10, 2, 10, 3, 1, 2, 5};
        selSort(array);
        for(var i : array){
            System.out.print(i + " ");
        }
    }

    public static void selSort(int[] arr) {
        for(int i=0; i <arr.length; ++i){
            int pos = i;
            int min = arr[pos];
            for(int j = i+1; j<arr.length; ++j){
                if(arr[j] < min){
                    pos = j;
                    min = arr[j];
                }
            }

            arr[pos] = arr[i];
            arr[i] = min;
        }
    }
}
