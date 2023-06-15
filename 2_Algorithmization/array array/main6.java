import java.util.Scanner;

public class main6 {
    public static void main(String[] args) {
        int N  = 6;
        Scanner in = new Scanner(System.in);
        int[][] arr = new int [N][N];

        for(int i = 0 ; i < (N/2 + N%2); ++i){
            for(int j = 0; j < N; ++j){
                if(j < i || j > N-(i+1) ){
                    arr[N-i-1][j] = 0;
                    arr[i][j] = 0;
                }else{
                    arr[N-i-1][j] = 1;
                    arr[i][j] = 1;
                }
            }
        }
        prt(arr,N);
    }

    public static void prt(int[][] arr, int row){
        for(int i =0; i < row; ++i){
            for(int j = 0; j < row; ++j){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}


