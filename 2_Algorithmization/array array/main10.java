import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class main10 {
    public static void main(String[] args) {
        int[][] arr = {{-1,-22,-3,-1},
                        {-2,2,-3,-5},
                        {-1,-1,-1,-1},
                        {-1,-1,-1,1}};

        for(int i = 0; i < arr.length; i++){
            if(arr[i][i] > 0 ){
                System.out.print(arr[i][i] + " ");
            }
        }

    }
}


