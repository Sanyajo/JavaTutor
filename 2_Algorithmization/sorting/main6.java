import java.util.Arrays;

public class main6 {
    public static void main(String[] args) {
        int[] array = {10, 2, 1, 3, 1, 2, 5};
        srt_funct(array);
        System.out.println(Arrays.toString(array));

    }

    public static void srt_funct(int[] arr){
        for(int i = 1; i < arr.length; ++i){
            for(int j =i; j>0 && arr[j-1] > arr[j]; --j){
                int buf = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = buf;
            }
        }
    }

}

