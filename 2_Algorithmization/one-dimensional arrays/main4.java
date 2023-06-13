import java.util.Scanner;
import java.util.Arrays;

public class main4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Введите N: ");
        int N = in.nextInt();
        int[] arr1 = new int[N];

        for(int i=0; i <N; ++i){
            arr1[i] = (int)((Math.random()*20)-10);
        }

        for(int i: arr1){
            System.out.print(i + " ");
        }
        System.out.println();

        int max_pos  = 0;
        int min_pos = 0;
        int min_arr = arr1[0];
        int max_arr = arr1[0];

        for(int i=0; i<arr1.length; ++i){
            if(max_arr < arr1[i]){
                max_arr = arr1[i];
                max_pos = i;
            }
            if(min_arr > arr1[i]){
                min_arr = arr1[i];
                min_pos = i;
            }
        }

        arr1[min_pos] = max_arr;
        arr1[max_pos] = min_arr;

        System.out.println();
        for(int i: arr1){
            System.out.print(i + " ");
        }
    }
}

