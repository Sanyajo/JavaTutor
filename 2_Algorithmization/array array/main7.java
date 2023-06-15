import java.util.Scanner;

public class main7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input N: ");
        int N = in.nextInt();
        double[][] arr = new double [N][N];

        for(int i=0; i <N; ++i){
            for(int j=0; j<N; ++j){
                arr[i][j] = Math.sin( (Math.pow(i,2) - Math.pow(j,2))/N );
            }
        }

        for(int i=0; i <N; ++i){
            for(int j =0; j <N; ++j){
                System.out.printf("%3f ",arr[i][j]);
            }
            System.out.println();
        }
    }
}


