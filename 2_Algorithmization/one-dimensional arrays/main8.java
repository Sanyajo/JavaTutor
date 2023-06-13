import java.util.Scanner;
import java.util.Arrays;

public class main8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        int[] new_arr = new int[10];

        for (int i = 0; i < arr.length; ++i) {
            arr[i] = (int) (1 + Math.random() * 10);
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int min = Arrays.stream(arr)
                .min()
                .getAsInt();

        System.out.println(min);

        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] != min) {
                new_arr[i] = arr[i];
                System.out.print(new_arr[i] + " ");
            }
        }
    }
}

