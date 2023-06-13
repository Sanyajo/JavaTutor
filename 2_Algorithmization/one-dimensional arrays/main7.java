import java.util.Scanner;
import java.util.Arrays;

public class main7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        int[] new_arr = new int [9];

        for(int i=0; i <arr.length; ++i){
            arr[i] = (int)(Math.random()*10);
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for(int i =0; i<arr.length-1; ++i){
            new_arr[i] = (arr[i] + arr[i+1]);
        }

        for(int i: new_arr){
            System.out.print(i + " ");
        }
        System.out.println();

        int answ = Arrays.stream(new_arr)
                .max()
                .getAsInt();

        System.out.println("Answer: "+ answ);
    }
}

