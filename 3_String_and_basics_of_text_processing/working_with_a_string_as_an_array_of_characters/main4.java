import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main4 {

    public static void main(String[] args) {
        String str = "Hell2o wor3ld w4ord";

        int koll = 0;

        for(int i=0; i <str.length(); ++i){
            if(Character.isDigit(str.charAt(i)))
                koll++;
        }

        System.out.println(koll);

    }
}