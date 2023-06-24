
public class main6 {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(funct(str));
    }

    public static StringBuffer funct(String str){
        StringBuffer strBuffer = new StringBuffer();
        for(int i=0; i < str.length(); ++i){
            strBuffer.append(charToString(str.charAt(i)).repeat(2));
        }
        return strBuffer;
    }

    public static String charToString(char ch){
        return String.valueOf(ch);
    }
}
