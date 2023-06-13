import java.util.Scanner;
import java.util.Arrays;

public class main5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];

        for(int i=0; i<arr.length; ++i){
            arr[i] = (int)(Math.random()*10);
        }

        for(int i: arr){
            System.out.print(i + " ");
        }
        System.out.println();

        for(int i=0; i <arr.length; ++i){
            if(arr[i] > i+1){
                System.out.print(arr[i] + " ");
            }
        }
    }
}

