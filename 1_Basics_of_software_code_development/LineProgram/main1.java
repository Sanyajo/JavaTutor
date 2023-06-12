package Exercise_1;
import java.util.Scanner;

public class main1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        short a  = in.nextShort();
        short b  = in.nextShort();
        short c  = in.nextShort();
        System.out.println(function(a,b,c));
        in.close(); 
    }

    static int function(short a, short b, short c){
        int z =( (a-3) * b/2) + c;
        return z;
    }
}