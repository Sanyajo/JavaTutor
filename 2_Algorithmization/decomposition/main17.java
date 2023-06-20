import java.util.*;

public class main17 {
    public static void main(String[] args) {
        System.out.println(f(123));

    }
    public static int f(int num){
        int k=0;
        while (num > 0){
            int buf = num;
            int sum=0;
            while(buf>0){
                sum+=buf%10;
                buf/=10;
            }
            k++;
            num = num-sum;
        }
        return k;
    }
}

