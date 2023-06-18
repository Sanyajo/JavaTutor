import java.util.Scanner;
public class main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("input a: ");
        int a = in.nextInt();

        System.out.printf("S =  %.3f",square(a));

    }

    public static double square(int a){
        return ( (3*Math.sqrt(3)) / 2 ) * Math.pow(a,2);
    }
}

