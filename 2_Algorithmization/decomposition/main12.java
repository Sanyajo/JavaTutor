import java.util.*;

public class main12 {
    public static void main(String[] args) {
        int k = 13;
        int n = 110;

        List<Integer> ls = funct(k,n);

        for(var i : ls){
            System.out.print(i + " ");
        }

    }

    public static int find_mnog(int k){
        int tmp = 1;
        while(k>0){
            tmp*=10;
            k/=10;
        }
        return tmp;
    }

    public static List funct(int k, int n){
        List<Integer> ls = new ArrayList<>();
        for(int i=0; i < k; ++i){
            if( (i + k-i) ==k && (i*find_mnog(k-i)+k-i) < n){
                ls.add( (i*find_mnog(k-i)+k-i));
            }
        }
        return ls;
    }

}

