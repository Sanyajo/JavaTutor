import java.util.*;
import java.time.LocalDate;

public class main5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Counter c1 = new Counter();
        c1.showCurrent();

        System.out.println("___________________");

        Counter c2 = new Counter(1,5,3);
        c2.showCurrent();
        System.out.println("___________________");
        c2.downCurrent();
        c2.showCurrent();
        System.out.println("___________________");

        Counter c3 = new Counter(1,3);
        c3.showCurrent();
        System.out.println("___________________");

        c3.downCurrent();
        c3.showCurrent();
        System.out.println("___________________");


    }

}

class Counter{
    private int min, max, current;

    public Counter(int min, int max, int current) {
        this.min = min;
        this.max = max;
        this.current = current;

        if (min > max) {
            int temp = min;
            min = max;
            max = min;
        }

        if (current > max){
            max = current;
        }
        if(current < min){
            min = current;
        }
    }

    public Counter(int min, int max){
        this.min = min;
        this.max = max;
        this.current = min;
    }

    public Counter(){
        this.min = (int)(Math.random()*10)+1;
        this.max = (int)(Math.random()*10)+1;
        this.current = (int)(Math.random()*10)+1;
        if (min > max) {
            int temp = min;
            min = max;
            max = min;
        }

        if (current > max){
            max = current;
        }
        if(current < min){
            min = current;
        }
    }

    public void upCurrent(){
        current++;
        if(current > max){
            System.out.println("Вышли за границу, счетчик не изменился!");
            current--;
        }
    }

    public void downCurrent(){
        current--;
        if(current < min){
            System.out.println("Вышли за границу , счетчик не изменился!");
            current++;
        }
    }

    public int getCurrent(){
        return current;
    }

    public void showCurrent(){
        System.out.println("min:\t" + this.min);
        System.out.println("current:\t" + this.current);
        System.out.println("max:\t" + this.max);
    }
}