import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {
        final int row  = 5;
        final int  column = 5;
        Scanner in = new Scanner(System.in);
        int[][] arr = new int [row][column];

        for(int i = 0; i < row; ++i){
            for(int j = 0; j < column; ++j){
                if(i%2 == 0){
                    arr[i][j] = j+1;
                }else{
                    arr[i][j] = column-j;
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


