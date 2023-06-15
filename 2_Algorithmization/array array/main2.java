import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = {{1, 2, 3, 4, 5},
                {6, 7, 8, 9, 1},
                {1, 2, 3, 4, 5},
                {6, 7, 2, 9, 2},
                {6, 7, 2, 9, 2}};

        for(int i=0 ; i < arr.length; ++i){
            System.out.println(arr[i][i]);
        }

    }
}


