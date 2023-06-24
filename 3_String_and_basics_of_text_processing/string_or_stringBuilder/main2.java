import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main2 {
    public static void main(String[] args) {
        String str = "Hello world baby!";
        System.out.println("Answer: " + funct(str));
    }

    public static StringBuffer funct(String str){
        StringBuffer stringBuffer = new StringBuffer(str);
        for(int i=0; i < stringBuffer.length(); ++i){
           if(stringBuffer.charAt(i) == 'a'){
               stringBuffer.insert(i+1,'b');
           }
       }
        return stringBuffer;
    }
}
