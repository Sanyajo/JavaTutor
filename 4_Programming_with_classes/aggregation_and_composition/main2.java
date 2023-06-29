import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Car c1 = new Car("BMW",4,4,17,80 );
        System.out.println(c1.getBenzValue());
        c1.refuel(80);
        System.out.println(c1.getBenzValue());
        c1.drive(2);
        System.out.println(c1.getBenzValue());
        
    }
}

class Engine {
    private int power;

    public Engine(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}

class Whell{
    private int diameterWhell;

    Whell(int diameterWhell){
        this.diameterWhell = diameterWhell;
    }

    public int getDiameterWhell() {
        return diameterWhell;
    }

    public void setDiameterWhell(int diameterWhell) {
        this.diameterWhell = diameterWhell;
    }
}

class Bak{
    private int bakValue;

    Bak(int bakValue){
        this.bakValue = bakValue;
    }

    public int getBakValue(){
        return this.bakValue;
    }

    public void setBakValue(int value){
        this.bakValue = value;
    }

}

class Car {

    protected Engine engine;
    protected Whell[] whell;
    protected Bak bak;
    private int benzValue;
    protected String markAuto;

    Car(String markAuto, int power, int kollWhell, int diamWhell, int bakValue){
        this.markAuto = markAuto;
        this.engine = new Engine(power);
        this.benzValue =0;
        this.bak = new Bak(bakValue);
        this.whell = new Whell[kollWhell];
        for(int i=0; i < kollWhell; ++i){
            this.whell[i] = new Whell(diamWhell);
        }
    }

    public String getMarkAuto(){
        return this.markAuto;
    }

    public void refuel(int kollBenz){
        if(kollBenz > (this.bak.getBakValue() - this.benzValue)){
            System.out.println("Вы заправились на: " + (kollBenz-(this.bak.getBakValue() - this.benzValue)) + " тк больше не влезло");
            this.benzValue = this.bak.getBakValue();
        }else{
            this.benzValue = kollBenz;
        }
    }

    public int getBenzValue(){
        return this.benzValue;
    }

    public void getWhellInfo(){
        for(int i = 0; i <whell.length; ++i){
            System.out.println("Диаметр " + (i+1)+ " колеса равен: " + this.whell[i].getDiameterWhell());
        }
    }

    public void drive(int km){
        this.benzValue -= (this.engine.getPower()*2*km);
    }
}