import java.util.Scanner;
import java.util.Arrays;

public class main6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Введите N: ");
        int N = in.nextInt();
        double[] arr = new double[N];

        for(int i=0; i<arr.length; ++i){
            arr[i] = (Math.random()*3);
        }

        double sum = 0.0;

        for(var i: arr){
            System.out.printf("%.2f ",i);
        }

        System.out.println();
        for(var i=0; i<arr.length; ++i){
            if(check(i)){
                sum+=arr[i];
            }
        }

        System.out.printf("%.2f ",sum);
    }

    public static boolean check(int number){
        if(number <2)   return false;
        for(int i=2; i <=Math.sqrt(number); ++i){
            if(number % i ==0){
                return false;
            }
        }
        return true;
    }
}

