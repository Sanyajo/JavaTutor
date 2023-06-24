
public class main4 {
    public static void main(String[] args) {
        String str = "информатика";

        String s  = charToString(funct_copy(str));
        System.out.println(funct_search(str, "т") + s + funct_search(str, "т"));
    }
    public static char[] funct_copy(String str){
        int start = 3, end = 5;
        char[] dst = new char[end - start];
        str.getChars(start, end , dst, 0);
        return dst;
    }

    public static char funct_search(String str, String symbol){
        int index = str.indexOf(symbol);
        char temp = str.charAt(index);
        return temp;
    }

    public static String charToString(char[] ch){
        return String.valueOf(ch);
    }
}
