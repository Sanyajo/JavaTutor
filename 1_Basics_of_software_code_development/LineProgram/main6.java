import java.util.Scanner;
public class main6 {
    public static void main (String[] args){
       Scanner in = new Scanner(System.in);

       System.out.println("Введите x: ");
       int x = in.nextInt();
       System.out.println("Введите y: ");
       int y = in.nextInt();

       System.out.println(funct(x,y));
    }

    public static boolean funct(int x, int y){
        int y_max = 4;
        int y_min = -4;
        int x_max = 4;
        int x_min = -4;
        return ( x >= x_min && x <= x_max && y >= y_min && y <=y_max);
    }
}