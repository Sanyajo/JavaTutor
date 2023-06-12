package Branching;
import java.util.Scanner;
public class main1 {
    public static void main (String[] args){
       Scanner in = new Scanner(System.in);

       System.out.println("Введите первый угол: ");
       int fir_corn = in.nextInt();
       System.out.println("Введите второй угол: ");
       int sec_corn = in.nextInt();
       int thir_corn = fir_corn + sec_corn;

       if(thir_corn < 180){
           if( (180 - thir_corn) == 90){
               System.out.println("Треугольник прямоугольный !");
           }else{
               System.out.println("Треугольник не прямоугольный !");
           }
       }else{
           System.out.println("Такого треугольника не существует !");
       }
    }
}