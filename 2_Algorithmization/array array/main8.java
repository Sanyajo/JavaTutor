import java.util.Scanner;

public class main8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input first column: ");
        int frt_column = in.nextInt();
        System.out.println("Input second column: ");
        int sec_column = in.nextInt();

        int[][] arr = {{1,2,3,4},{1,2,3,4},{1,2,3,4}};

        if(frt_column == sec_column){
            pr_arr(arr);
            return;
        }

        for(int i =0; i < arr.length; ++i){
            for(int j = 0; j < arr[i].length; ++j){
                int buf = 0;
                if( (j+1) == frt_column){
                    buf = arr[i][sec_column-1];
                    arr[i][sec_column-1] = arr[i][frt_column-1];
                    arr[i][frt_column-1] = buf;
                }
            }
        }
        pr_arr(arr);

    }

    public static void pr_arr(int[][] arr){
        for(int i=0; i <arr.length; ++i){
            for(int j = 0 ; j< arr[i].length; ++j){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}


