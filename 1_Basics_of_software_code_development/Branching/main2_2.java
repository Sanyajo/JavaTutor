import java.util.Scanner;
import java.util.Arrays;
public class main2_2 {
    public static void main (String[] args){
       Scanner in = new Scanner(System.in);

       int[] arr1 = new int[5];
       arr1 = funct(arr1);

       for(int i: arr1){
           System.out.print(i+" ");
       }

       System.out.println();

       int[] arr2 = new int [5];
       arr2 = funct(arr2);

       for(int i: arr2){
           System.out.print(i+" ");
       }

       int min1 = fmin_el(arr1);
       int min2 = fmin_el(arr2);

        if(min1>min2){
            System.out.println("\nОтвет: "+min1);
        }else{
            System.out.println("\nОтвет: "+min2);
        }

    }

    public static int[] funct(int[] arr){
        for(int i=0; i<arr.length; ++i){
            arr[i] = (int)(1+ Math.random()*10);
        }
        return arr;
    }

    public static int fmin_el(int[] arr){
        int min = arr[0];
        for(int i = 0; i <arr.length; ++i){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}