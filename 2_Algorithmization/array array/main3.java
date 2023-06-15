import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = {{1, 2, 3, 4, 5},
                {6, 7, 8, 9, 1},
                {1, 2, 3, 4, 5},
                {6, 7, 2, 9, 2},
                {6, 7, 2, 9, 2}};

        System.out.println("Input k: ");
        int k = in.nextInt() - 1;
        System.out.println("Input p: ");
        int p = in.nextInt() - 1;

        for(int j = 0; j < arr.length; ++j){
            System.out.print(arr[k][j] + " ");
        }

        System.out.println();
        System.out.println();

        for(int i=0; i < arr.length; ++i){
            System.out.println(arr[i][p]);
        }
    }
}


