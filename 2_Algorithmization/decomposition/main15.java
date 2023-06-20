import org.w3c.dom.ls.LSException;

import java.util.*;
import java.util.Scanner;

public class main15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        List<Integer> ls = funct();

        for(var i: ls){
            System.out.print(i + " ");
        }
        
    }

    public static List funct(){
        List<Integer> ls = new ArrayList<>();
        for(int i=1; i <=9; ++i){
            int buf = i;
            for(int j=i+1; j <=9; ++j){
                buf = buf*10 + j;
                ls.add(buf);
            }
        }
        return ls;
    }
}

