package exercise_5;

public class Cruise<T> implements Tur {
    private Object transport;
    private Object feeding;
    private Object kollday;
    private Object bob;
    private String name;
    public void setBob(){};

    Cruise(String transport, T feeding, T kollday){
        this.name = "Cruise";
        this.kollday = kollday;
        this.feeding = feeding;
        this.transport = transport;
    }
    public Object getName(){
        return this.name;
    }

    public void setKollDay(Object kollDay) {
        this.kollday = kollDay;
    }
    @Override
    public Object getKollDay() {
        return this.kollday;
    }

    @Override
    public void setFeeding(Object feeding) {
        this.feeding = feeding;
    }
    @Override
    public Object getFeeding() {
        return this.feeding;
    }

    @Override
    public Object getTransportChoise() {
        return this.transport;
    }

    @Override
    public void setTransportChoise(Object typeTransport) {
        this.transport = typeTransport;
    }

    public String toString(){
        return "Name: \"" + this.name
                +"\nTransport:"  + this.transport
                +"\nKoll feeding: " + this.feeding
                +"\nKoll days: " + this.kollday;
    }
}
