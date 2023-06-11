import java.util.Scanner;
public class main5 {
    public static void main (String[] args){
        int T = 606061;

        int hours = T / 3600;
        int minutes = (T % 3600) / 60;
        int seconds = (T % 3600) % 60;

        String formattedTime = String.format("%02dч %02dмин %02dс", hours, minutes, seconds);
        System.out.println(formattedTime);
    }
}