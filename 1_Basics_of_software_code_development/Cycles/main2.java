import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        List<Integer> primes = findPrime(N);

        for(int prime: primes){
            System.out.print(prime + " ");
        }

    }

    public static List<Integer> findPrime(int number){
        List<Integer> primes = new ArrayList<>();
        for(int i=2; i<=number; ++i){
            if(check(i)){
                primes.add(i);
            }
        }
        return primes;
    }

    public static boolean check(int number){
        if(number < 2)  return false;
        for(int i = 2; i <= Math.sqrt(number); ++i){
            if(number % i ==0){
                return false;
            }
        }
        return true;
    }
}

