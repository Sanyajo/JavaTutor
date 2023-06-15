import java.util.Scanner;

public class main6 {
    public static void main(String[] args) {
        int row  = 6;
        final int  column = 6;
        Scanner in = new Scanner(System.in);
        int[][] arr = new int [row][row];

        for(int i = 0 ; i < (row/2 + row%2); ++i){
            for(int j = 0; j < row; ++j){
                if(j < i || j > row-(i+1) ){
                    arr[row-i-1][j] = 0;
                    arr[i][j] = 0;
                }else{
                    arr[row-i-1][j] = 1;
                    arr[i][j] = 1;
                }
            }
        }
        prt(arr,row,column);
    }

    public static void prt(int[][] arr, int row, int column){
        for(int i =0; i < row; ++i){
            for(int j = 0; j < column; ++j){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}


