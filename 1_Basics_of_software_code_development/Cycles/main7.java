import java.math.BigDecimal;
import java.util.Scanner;

public class main7 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        try{
            int m , n;

            System.out.println("Input m: ");
            m = in.nextInt();
            System.out.println("Input n: ");
            n = in.nextInt();
            String res = "";

            if(n <= 0 || m <=0){
                throw new Exception("m or n <= 0 !");
            }

            for(; m <= n; ++m){
                for(int i=2; i < m; ++i){
                    if( (m % i ) == 0){
                        res+=i+";";
                    }
                }
                if( res == ""){
                    continue;
                }else{
                    System.out.print(m+"\t" + res+"\n");
                    res = "";
                }
            }

        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}

