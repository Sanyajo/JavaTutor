import org.w3c.dom.ls.LSException;

import java.util.*;
import java.util.Scanner;

public class main16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<Integer> ls = funct();

        for(var i: ls){
            System.out.print(i + " ");
        }
        System.out.println();

        int sum = sum(ls);
        System.out.print("Sum: " + sum);

    }

    public static List funct(){
        List<Integer> ls = new ArrayList<>();
        for(int i=1; i <=9; i+=2){
            int buf = i;
            for(int j=i+2; j <=9; j+=2){
                buf = buf*10 + j;
                ls.add(buf);
            }
        }
        return ls;
    }

    public static int sum(List<Integer> ls){
        int sum=0;
        for(int i=0; i < ls.size(); ++i){
            sum+= ls.get(i);
        }
        return sum;
    }
}

