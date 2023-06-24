import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main1 {
    public static void main(String[] args) {
        String str = "Hello world   biby!";
        System.out.println("Answer: " + funct(str));
    }

    public static int funct(String str){
       int max = 0, temp = 0;
       for(int i=0; i <str.length(); ++i){
           if(str.charAt(i) == ' '){
               temp++;
               if(temp > max){
                   max = temp;
               }
           }else{
               temp =0;
           }
       }
       return max;
    }
}
