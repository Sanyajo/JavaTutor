import java.util.*;

public class main8 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,2,3,1,2,5};
        List<Integer> ls = new ArrayList<>();
        sum(arr, ls);

        for(var i : ls){
            System.out.print(i +" ");
        }

    }
    public static void sum(int[] arr, List<Integer> ls){
     for(int i=0; i<arr.length; i+=3){
         int sum = 0;
         for(int j = i; j < (i+3); ++j){
             sum+=arr[j];
         }
         ls.add(sum);
     }
    }
}


