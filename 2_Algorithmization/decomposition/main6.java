import java.util.*;

public class main6 {
    public static void main(String[] args) {
        int[] arr1 = {3,3,6};
        int[] arr2 = {14,25,11};

        int min1 = Arrays.stream(arr1)
                .min().getAsInt();
        int min2= Arrays.stream(arr2)
                .min().getAsInt();

        if(find_min(arr1, min1) == 1){
            System.out.println("Simple number");
        }else{
            System.out.println("No simple number");
        }

        if(find_min(arr2, min2) == 1){
            System.out.println("Simple number");
        }else{
            System.out.println("No simple number");
        }

    }

    public static int find_min(int[] arr, int div){
        for(int i =0; i < arr.length; ++i){
            if(arr[i] % div !=0)
                return find_min(arr, div-1);
        }
        return div;
    }
}


