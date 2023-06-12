import java.util.Scanner;
public class main2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double a,b,c;

        System.out.println("Input b: ");
        b = in.nextDouble();

        try{
            System.out.println("Input a: ");
            a = in.nextDouble();
            if(a == 0){
                throw new Exception("Number a = 0 !");
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
            return ;
        }

        System.out.println("Input c: ");
        c = in.nextDouble();

        double form = ( (b + Math.sqrt( Math.pow(b,2) + 4*a*c) )/ (2*a) ) - Math.pow(a,3)*c + Math.pow(b, -2);
        System.out.println(form);

        in.close();
    }
}
