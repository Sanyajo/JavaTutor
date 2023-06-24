public class main10 {
    public static void main(String[] args) {
        String str = "Hello my name noname. Yse? NO !";
        str = str.replace(" ","");

        String[] new_str = str.split("");
        funct(new_str);
    }

    public static void funct(String[] str){
        int koll=0;
        for(int i=0; i < str.length; ++i){
            if(str[i].equals("!") || str[i].equals("?") || str[i].equals(".")){
                koll++;
            }
        }
        System.out.println("Koll: " + koll);
    }
}
