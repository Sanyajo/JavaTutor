import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main3 {

    public static void main(String[] args) {
        String str = "Hell2o wor3ld w4ord";
        String[] symbol = {"1","2","3","4","5","6","7","8","9"};

        int koll = 0;
        for(int i=0; i < symbol.length; ++i){
            Pattern pattern = Pattern.compile(symbol[i]);
            Matcher matcher = pattern.matcher(str);
            while(matcher.find())
                koll++;
        }

        System.out.println(koll);

    }
}