import java.util.Scanner;

public class main10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Inpit n: ");
        int n = in .nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i <arr.length; ++i){
            arr[i] = (int)(Math.random()*10) +1;
        }

        for(int i=1; i< arr.length; i+=2){
            arr[i] = 0;
        }

        for(var i : arr){
            System.out.print(i + " ");
        }
    }
}


