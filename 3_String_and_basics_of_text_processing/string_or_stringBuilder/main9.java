
public class main9 {
    public static void main(String[] args) {
        String str = "HeLlo, mY name";
        str = str.replace(",", "").replace(" ","");
        String[] new_str = str.split("");
        funct(new_str);
    }

    public static void funct(String[] str){
        int uppKoll = 0, lowKoll = 0;
        for(int i=0; i < str.length; ++i){
            if(sheckCase(str[i])){
                uppKoll++;
            }else{
                lowKoll++;
            }
        }
        System.out.println("uppKoll: " + uppKoll);
        System.out.println("lowKoll: " + lowKoll);
    }
    public static boolean sheckCase(String symbol){
        return symbol == symbol.toUpperCase();
    }
}
