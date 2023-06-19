import java.util.*;

public class main10 {
    public static void main(String[] args) {
        int N = 123;

        List<Integer> ls =funct(N);
        for(var i : ls){
            System.out.print(i + " ");
        }

    }

    public static List funct(int N){
        List<Integer> ls = new ArrayList<>();
        int i = 0;
        while(N > 0){
            int buf = N %10;
            ls.add(buf);
            i++;
            N/=10;
        }
        Collections.reverse(ls);
        return ls;
    }
}

