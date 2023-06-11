import java.util.Scanner;
public class main4 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);

        double num = in.nextDouble();

        double buf = 0;
        num *=1000;

        if (num < 0){
            num *= (-1);
            while((int)num !=0){
                int i = (int)num % 10;
                buf = buf*10 + i;
                num /= 10;
            }
            buf /=-1000;
            System.out.println(buf);
        }else{
            while((int)num !=0){
                int i = (int)num % 10;
                buf = buf*10 + i;
                num /= 10;
            }
            buf /=1000;
            System.out.println(buf);
        }
    }
}