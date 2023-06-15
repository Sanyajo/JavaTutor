import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class main9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите n: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        arr = fill_arr(arr);
        print_arr(arr);
        System.out.println();

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i< arr.length; ++i){
            int koll = 0;
            for(int j = 0; j<arr.length; ++j){
                if(arr[i] == arr[j]){
                    koll++;
                    hm.put(arr[i], koll);
                }
            }
        }
        List<Integer> keyList = new ArrayList<>(hm.keySet());
        System.out.println("Answer: " + keyList.get(0));
    }

    public static int[] fill_arr(int[] arr){
        for(int i=0 ; i<arr.length; ++i){
            arr[i] = (int) (1+Math.random()*10);
        }
        return arr;
    }

    public static void print_arr(int[] arr){
        for(var i : arr){
            System.out.print(i + " ");
        }
    }
}


