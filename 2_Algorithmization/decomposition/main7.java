import java.util.*;

public class main7 {
    public static void main(String[] args) {
        int n = 9;
        System.out.println("Answer: " + fact(n));
    }
    public static int fact(int n){
      int res =1;
      for(int i =1; i<=n; i+=2){
          res = res * i;
      }
      return res;
    }
}


