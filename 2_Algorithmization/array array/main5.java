import java.util.Scanner;

public class main5 {
    public static void main(String[] args) {
        int row  = 5;
        final int  column = 5;
        Scanner in = new Scanner(System.in);
        int[][] arr = new int [row][column];

        for(int i = 0 ; i < row; ++i){
            for(int j = 0; j < row; ++j){
                if( j >= (row -i) ){
                    arr[i][j] = 0;
                }else{
                    arr[i][j] = i+1;
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


