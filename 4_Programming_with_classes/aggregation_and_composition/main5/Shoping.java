package exercise_5;

public class Shoping<T> implements Tur {
    private Object transport;
    private String name;
    private Object feeding;
    private Object kollday;

    Shoping(String transport, T feeding, T kollday){
        this.name = "Shoping";
        this.kollday = kollday;
        this.feeding = feeding;
        this.transport = transport;
    }
    @Override
    public void setKollDay(Object kollDay) {
        this.kollday = kollDay;
    }
    @Override
    public Object getKollDay() {
        return this.kollday;
    }

    public Object getName(){
        return this.name;
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
