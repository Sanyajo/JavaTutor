import java.util.Scanner;
public class main3 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Input x: ");
        double x = in.nextDouble();

        System.out.print("Input y: ");
        double y = in.nextDouble();

        double funct = ( (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) ) * Math.tan(x*y);

        System.out.println(funct);
    }
}