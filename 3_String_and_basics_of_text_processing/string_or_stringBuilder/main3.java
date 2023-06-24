import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main3 {
    public static void main(String[] args) {
        String str = "ele";
        System.out.println(isPalindrom(str));

        String str1 = "hello";
        System.out.println(isPalindrom(str1));


    }
    public static boolean isPalindrom(String str){
        StringBuilder strBuilder = new StringBuilder(str);
        strBuilder.reverse(); //переворачиваем строку
        String invertedText = strBuilder.toString();//присваиваем перевернутую строку

        return str.equalsIgnoreCase(invertedText) ;
    }
}
