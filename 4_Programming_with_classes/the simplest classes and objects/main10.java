import java.util.*;

public class main10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
            Airline airline1 = new Airline("Москва","Грузовой",13,"Вторник",18,20);
            Airline airline2 = new Airline("Люблин","Пассажирский",13,"Понедельник",0,1);
            Airline airline3 = new Airline("Юпитер","Пассажирский",13,"Понедельник",13,1);

            List<Airline> airlines = new ArrayList<>();
            airlines.add(airline1);
            airlines.add(airline2);
            airlines.add(airline3);

            Airoport airoport = new Airoport();
            airoport.setAirlines(airlines);

            airoport.sortDestination("москва");
            airoport.sortDayWeek("Понедельник");
            airoport.sortDayWeek("Понедельник", 12);

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

}

class Airline {
    private String destination, aircraftType;
    private int flightNum, hour, minute;
    private String dayWeek;

    Airline(String destination, String aircraftType, int flightNum, String dayWeek, int hour, int minute){
        this.destination = destination;
        this.aircraftType = aircraftType;
        this.flightNum = flightNum;
        this.dayWeek = dayWeek;

        if(hour > 60 || hour < 0){
            this.hour = 0;
        }else{
            this.hour = hour;
        }
        if(minute > 60 || minute < 0){
            this.minute = 0;
        }else{
            this.minute = minute;
        }
    }
    public String getAircraftType(){
        return this.aircraftType;
    }
    public int getFlightNum(){
        return this.flightNum;
    }
    public int getHour(){
        return this.hour;
    }
    public int getMinute(){
        return this.minute;
    }
    public String getDestination(){
        return this.destination;
    }
    public String getDayWeek(){
        return this.dayWeek;
    }


    public void setAircraftType(String aircraftType){
        this.aircraftType = aircraftType;
    }
    public void setDestination(String destination){
        this.destination = destination;
    }
    public void setFlightNum(int flightNum){
        this.flightNum = flightNum;
    }
    public void setCalendar(String dayWeek){
        this.dayWeek = dayWeek;
    }
    public void setHour(int hour){
        this.hour = hour;
    }
    public void setMinute(int minute){
        this.minute = minute;
    }

    public String toString(){
        return "Пункт назначения: " + this.destination
                +"\nНомер рейса: " + this.flightNum
                +"\nТип самолета: " + this.aircraftType
                +"\nВремя вылета: " + this.hour + ":" + this.minute
                +"\nДень недели: " + this.dayWeek
                +"\n__________________________";
    }
}

class Airoport{
    List<Airline> airlines;
    public Airoport(){
    }

    public void setAirlines(List<Airline> airlines){
        this.airlines = airlines;
    }

    public void sortDestination(String destination){
        for(Airline airline : airlines){
            if(airline.getDestination().equalsIgnoreCase(destination)){
                System.out.println(airline);
            }
        }
    }

    public void sortDayWeek(String dayWeek){
        for(Airline airline : airlines){
            if(airline.getDayWeek().equalsIgnoreCase(dayWeek)){
                System.out.println(airline);
            }
        }
    }

    public void sortDayWeek(String dayWeek, int time){
        for(Airline airline : airlines){
            if(airline.getDayWeek().equalsIgnoreCase(dayWeek) && airline.getHour()> time){
                System.out.println(airline);
            }
        }
    }

}