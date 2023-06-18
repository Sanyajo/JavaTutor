import java.lang.*;
import java.util.ArrayList;
import java.util.List;

public class main8 {
    public static void main(String[] args) {
        Rational r1 = new Rational(3,5);
        Rational r2 = new Rational(2,6);
        Rational r3 = new Rational(1,4);

        List<Rational> ls = new ArrayList<>();
        ls.add(r1);
        ls.add(r2);
        ls.add(r3);

        Rational.prnt(ls);
        System.out.println();

        Rational.obhznam(ls);
        System.out.println();

        Rational.prnt(ls);
        System.out.println();

        Rational.chSort(ls);
        Rational.prnt(ls);

    }
}

class Rational{
    private int n, d;

    public Rational(int n, int d) throws ArithmeticException{
        if( d == 0 )    throw new ArithmeticException("Error d == 0");
        this.n = n ;
        this.d = d;
    }
    public static void obhznam(List<Rational> ls ){
        int znam = 1;
        int size = ls.size();
        while(size > 0){
            znam *= ls.get(size-1).d;
            size--;
        }

        for(int i=0; i < ls.size(); ++i){
            ls.get(i).n = ls.get(i).n * (znam/ls.get(i).d);
            ls.get(i).d = znam;
        }
    }

    public static void chSort(List<Rational> ls){
        for(int i=0; i<ls.size()-1; ++i){
            for(int j=0; j <ls.size()-1-i;++j){
                if(ls.get(j+1).n < ls.get(j).n){
                    int swap = ls.get(j).n;
                    ls.get(j).n = ls.get(j+1).n;
                    ls.get(j+1).n = swap;
                }
            }
        }
    }
    public static void prnt(List<Rational> ls){
        for(var i: ls){
            System.out.println(i);
        }
    }
    public String toString() {
        return n + "/" + d;
    }
}