import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class main8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        List<Integer> cia1 = funct(num1);
        List<Integer> cia2 = funct(num2);

        List<Integer> answ = new ArrayList<Integer>();

        for(int i : cia1){
            for(int j : cia2){
                if (i == j){
                    answ.add(i);
                }
            }
        }

        System.out.println(answ);
    }

    public static List<Integer> funct(int num){
        String str_num = Integer.toString(num);
        char[] ch_num = str_num.toCharArray();
        List <Integer> cia = new ArrayList<Integer>();

        for(int i=0; i<ch_num.length; ++i){
            int c = Character.getNumericValue(ch_num[i]);
            cia.add(c);
        }
        return cia;
    }
}

