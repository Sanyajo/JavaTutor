import java.util.*;

public class main11 {
    public static void main(String[] args) {
        int number1 = 123;
        int number2 = 1233;

        List<Integer> ls1 =funct(number1);
        List<Integer> ls2 =funct(number2);


        if(ls1.size() > ls2.size())
            System.out.println(number1 + ">" + number2);
        else if (ls1.size() < ls2.size())
            System.out.println(number1 + "<" + number2);
        else
            System.out.println(number1 + "=" + number2);
    }

    public static List funct(int N){
        List<Integer> ls = new ArrayList<>();
        while(N > 0){
            int buf = N %10;
            ls.add(buf);
            N/=10;
        }
        Collections.reverse(ls);
        return ls;
    }
}

