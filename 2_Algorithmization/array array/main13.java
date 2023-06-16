import java.util.Collections;
import java.util.Arrays;
import java.util.Comparator;

public class main13 {
    public static void main(String[] args) {
        int[][] arr = new int [4][5];

        for(int i = 0; i < arr.length; ++i){
            for(int j =0; j < arr[i].length; ++j){
                arr[i][j] = (int) (Math.random()*5)+1;
            }
        }
        print_arr(arr);

        for(int i=0; i<arr[0].length; ++i){
            if (i % 2 == 0) {
                vozr_sort(arr, i );
            }else{
                yb_sort(arr, i);
            }
        }

        System.out.println();
        System.out.println();
        print_arr(arr);

    }

    public static void print_arr(int[][] arr){
        for(int i = 0; i < arr.length; ++i){
            for(int j =0; j < arr[i].length; ++j){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void yb_sort(int[][] arr, int pos){
        int[] buf = new int [arr.length];
        for(int i =0; i < arr.length; ++i){
            buf[i] = arr[i][pos];
        }

        Arrays.sort(buf);

        for(int i =0; i < arr.length; ++i){
            arr[i][pos] = buf[i];
        }
    }

    public static void vozr_sort(int[][] arr, int pos){
        Integer[] buf = new Integer [arr.length];
        for(int i =0; i < arr.length; ++i){
            buf[i] = arr[i][pos];
        }

        Arrays.sort(buf,Comparator.reverseOrder());


        for(int i =0; i < arr.length; ++i){
            arr[i][pos] = buf[i];
        }
    }

}


