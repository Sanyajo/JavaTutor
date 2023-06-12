import java.math.BigDecimal;

public class main5 {
    public static void main(String[] args){
        final double e = 0.00001;

        double sum = 0.0;
        int i = 0;
        double term ;

        do{
            term = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
            if(Math.abs(term) >= e){
                sum+=term;
            }
            i++;
        }while(Math.abs(term) >= e);
        System.out.println(sum);
    }
}

