import java.util.Scanner;
public class main5 {
    public static void main (String[] args){
      Scanner in = new Scanner(System.in);

      System.out.println("Input x: ");
      double x = in.nextDouble();

      System.out.println("Answer: "+ funct(x));
    }

    public static double funct(double x){
        if (x <=3){
            return (Math.pow(x,2) - 3*x +9);
        }else{
            return 1/(Math.pow(x,3) + 6);
        }
    }
}