import java.util.regex.Pattern;

public class main8{
    public static void main(String[] args) {
        String str = "Hello, my name";
        String[] new_str = str.split("\\s|,");
        System.out.println(funct(new_str));
    }
    public static String funct(String[] str){
        int max = str[0].length();
        int index = 0;
        for(int i=0; i < str.length; ++i){
            if(str[i].length() > max){
                max = str[i].length();
                index = i;
            }
        }
        return str[index];
    }
}
