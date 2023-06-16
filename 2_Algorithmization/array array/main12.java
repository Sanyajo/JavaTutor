import java.util.Collections;
import java.util.Arrays;
import java.util.Comparator;

public class main12 {
    public static void main(String[] args) {
        Integer[][] arr = new Integer [4][5];

        for(int i = 0; i < arr.length; ++i){
            for(int j =0; j < arr[i].length; ++j){
                arr[i][j] = (int) (Math.random()*5)+1;
            }
        }
        print_arr(arr);

        for(int i = 0; i < arr.length; ++i){
            if (i % 2 == 0) {
                Arrays.sort(arr[i],Comparator.naturalOrder());
            }else{
                Arrays.sort(arr[i],Comparator.reverseOrder());
            }
        }

        System.out.println();
        print_arr(arr);
    }

    public static void print_arr(Integer[][] arr){
        for(int i = 0; i < arr.length; ++i){
            for(int j =0; j < arr[i].length; ++j){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

}


