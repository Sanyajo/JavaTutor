import java.util.*;

public class main13 {
    public static void main(String[] args) {
        find_mnog(5);
    }

    public static void find_mnog(int n){
       for(int i=n; i <n*2; ++i){
           if( check(i) ){
               System.out.println( (6*i-1) + " : " + (6*i+1) );
           }
       }
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

