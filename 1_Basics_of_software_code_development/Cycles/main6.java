import java.math.BigDecimal;
import java.util.Scanner;

public class main6 {
    public static void main(String[] args){
        String alph = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
        char[] ch = alph.toCharArray();
        for(var i : ch){
            System.out.println(i+" "+(int)i);
        }
    }
}

