import java.util.HashSet;
import java.util.Set;

public class main7 {
    public static void main(String[] args) {
        String str = "abc cde def";
        System.out.println(funct(str));
    }

    public static String charToString(char[] ch){
        return String.valueOf(ch);
    }

    public static String funct(String str){
        String new_str = str.replace(" ","");

        Set<Character> uniqueChar = new HashSet<>();
        StringBuilder output = new StringBuilder();
        for(int i=0; i < new_str.length(); ++i){
            char temp = new_str.charAt(i);
            if(!uniqueChar.contains(temp)){
                output.append(temp);
                uniqueChar.add(temp);
            }
        }
        return output.toString();
    }
}
