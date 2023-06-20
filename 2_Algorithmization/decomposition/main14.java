import java.util.*;
import java.util.Scanner;

public class main14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input k: ");
        int k = in.nextInt();

        List<Integer> ls = arm(k);

        for(var i : ls){
            System.out.print(i + " ");
        }

    }

    public static List find_koll(int num){
        List<Integer>  ls = new ArrayList<>();
        while(num>0){
            ls.add(num%10);
            num/=10;
        }
        return ls;
    }

    public static List arm(int k){
        List<Integer> fin = new ArrayList<>();
        for(int i=1; i < k; ++i){
            int num=0;
            List<Integer>  ls = find_koll(i);
            for(int j=0; j < ls.size(); ++j){
                num+=Math.pow(ls.get(j), ls.size());
            }

            if(num == i){
                fin.add(num);
            }
        }
        return fin;
    }
}

