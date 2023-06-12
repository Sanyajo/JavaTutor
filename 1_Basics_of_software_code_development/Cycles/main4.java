import java.math.BigInteger;

public class main4 {
    public static void main(String[] args){
        int limit = 200;
        BigInteger sum = BigInteger.ONE;
        for(int i = 1; i <=limit; ++i){
            BigInteger value = BigInteger.valueOf(i);
            BigInteger num = value.multiply(value);
            sum = sum.multiply(num);
        }
        System.out.println(sum);
    }
}

