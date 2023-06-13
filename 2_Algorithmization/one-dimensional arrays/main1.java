import java.util.Scanner;

public class main1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Input K: ");
        int K = in.nextInt();

        int[] arr = new int[10];
        for(int i = 0; i < arr.length; ++i){
            arr[i] = (int) (1 + Math.random()  * 10);
        }

        for(int i: arr){
            System.out.print(i+ " ");
        }

        System.out.println();
        int sum = 0;
        for(int i = 0; i < arr.length; ++i){
            if(arr[i]%K == 0){
                sum+=arr[i];
            }
        }

        System.out.println(sum);

    }
}

