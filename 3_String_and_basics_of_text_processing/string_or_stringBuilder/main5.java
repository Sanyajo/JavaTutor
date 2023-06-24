
public class main5 {
    public static void main(String[] args) {
        String str = "русские ааа english aaa";
        System.out.println("Answer: " + funct(str));
    }

    public static int funct(String str){
        int koll = 0;
        for(int i=0; i < str.length(); ++i){
            if( str.charAt(i) == 97 || str.charAt(i) == 1072)
                koll++;
        }
        return koll;
    }
}
