import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.List;

public class main5 {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();

        array_fill(lst);

        print_array(lst);
        System.out.println();

        Collections.sort(lst, Collections.reverseOrder());
        print_array(lst);
        System.out.println();

        System.out.println("Answer: " + find_min(lst));

    }

    public static void array_fill(List<Integer> ls){
        for(int i = 0; i < 5; ++i){
            ls.add((int)(Math.random()*5)+1);
        }
    }
    public static void print_array(List<Integer> ls){
        for(var i : ls){
            System.out.print(i + " ");
        }
    }

    public static int find_min(List<Integer> ls){
        int min = ls.get(0);
        for(int i=1; i<ls.size()-1; ++i){
            if(ls.get(0) > ls.get(i) && ls.get(i) >= ls.get(i+1)){
                min = ls.get(i);
                break;
            }
        }
        return min;
    }
}


