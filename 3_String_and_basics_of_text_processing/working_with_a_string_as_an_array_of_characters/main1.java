import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main1 {

    public static void main(String[] args) {
       String[] str = {"HelloWorld","MyName"};
       Pattern pattern = Pattern.compile("\\B([A-Z])");
       for(int i=0; i <str.length; ++i){
           StringBuffer strb = new StringBuffer();
           Matcher matcher = pattern.matcher(str[i]);
           while(matcher.find()){
               matcher.appendReplacement(strb, "_$0");
           }
           matcher.appendTail(strb);
           str[i] = strb.toString().toLowerCase();
       }
       System.out.println(Arrays.toString(str));
    }
}