import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = {{1, 2, 3, 4, 5},
                {6, 7, 8, 9, 1},
                {1, 2, 3, 4, 5},
                {6, 7, 2, 9, 2}};

        int i = 0;
        for(int j =0; j <= arr.length; j+=2){
            if(arr[i][j] > arr[arr.length-1][j]){
                print_st(arr, i, j );
            }

        }

    }
    public static void print_st(int[][] arr, int i, int j){
        for(; i <arr.length; ++i){
                System.out.println(arr[i][j]);
        }
        System.out.println();
    }
}


