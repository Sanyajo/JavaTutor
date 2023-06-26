import java.util.*;

public class main6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Time tm = new Time(12,28,33);
        tm.showTime();
        System.out.println("________________________");

        tm.setTime(25,59,59);
        tm.showTime();
        System.out.println("________________________");

        tm.setHours(23);
        tm.showTime();
        System.out.println("________________________");

    }

}

class Time{
    private int hours, minute, seconds;

    public Time(int hours, int minute, int seconds){
        this.hours = hours;
        this.minute = minute;
        this.seconds = seconds;

        if(hours>24){
            this.hours = 0;
        }
        if(minute > 60){
            this.minute = 0;
        }
        if(seconds > 60){
            this.seconds = 0;
        }
    }

    public void setHours(int hours){
        if(hours>24){
            this.hours = 0;
        }else{
            this.hours = hours;
        }
    }

    public void setMinute(int minute){
        if(minute > 60){
            this.minute = 0;
        }else{
            this.minute = minute;
        }
    }

    public void setSeconds(int seconds){
        if(seconds > 60){
            this.seconds = 0;
        }else{
            this.seconds = seconds;
        }
    }

    public void setTime(int hours, int minute, int seconds){
        if(hours>24){
            this.hours = 0;
        }else{
            this.hours = hours;
        }
        if(minute > 60){
            this.minute = 0;
        }else{
            this.minute = minute;
        }
        if(seconds > 60){
            this.seconds = 0;
        }else{
            this.seconds = seconds;
        }
    }

    public void showTime(){
        System.out.println("Часы: " + this.hours);
        System.out.println("Минуты: " + this.minute);
        System.out.println("Секунды: " + this.seconds);
    }
}