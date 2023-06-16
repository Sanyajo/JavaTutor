import java.util.Arrays;
import java.util.Scanner;

public class main9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] arr = {{1, 2, 3, 5}, {1, 2, 3, 6}, {3, 2, 3, 5}};
        pr_arr(arr);

        int[] sum = new int [arr[0].length];
        int size = arr[0].length;
        int column = 0;

        while (size > 0){
            for(int i = 0; i < arr.length; ++i){
                sum[column]+=arr[i][column];
            }
            column++;
            size--;
        }
        System.out.println();
        for(var i : sum){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Answer: " + f_max(sum));
    }

    public static void pr_arr(int[][] arr){
        for(int i=0; i <arr.length; ++i){
            for(int j = 0 ; j< arr[i].length; ++j){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int f_max(int[] sum){
        int max = 0;
        for(int i = 0 ; i < sum.length; ++i){
            if(sum[i] > sum[max]){
                max = i;
            }
        }
        return max+1;
    }
}


