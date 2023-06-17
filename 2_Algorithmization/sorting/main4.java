import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class main4 {
    public static void main(String[] args) {
        int[] array = {10, 2, 10, 3, 1, 2, 5};
        bubblSort(array);
        for(var i : array){
            System.out.print(i + " ");
        }
    }
    public static void bubblSort(int[] arr) {
        for(int  i=0; i <arr.length-1; ++i){
            for(int j=0; j < arr.length-1-i; ++j){
                if(arr[j+1] < arr[j]){
                    int swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = swap;
                }
            }
        }
    }
}
