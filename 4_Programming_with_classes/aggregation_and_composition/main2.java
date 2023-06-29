import java.util.*;

public class main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Car c1 = new Car("BMW",30,2003,4,200,4.4);
        c1.setScopeBack(15);
        System.out.println("Кол бегнзина: " + c1.getScopeBack());
        c1.drive(5);
        System.out.println("Кол бегнзина: " + c1.getScopeBack());

        System.out.println(c1.getCarBrand());

        c1.getAllWhell();
        c1.setWhell(1,30);
        c1.getAllWhell();


    }
}

class Engine{
    private int power;
    private double scopeEngine;

    public Engine(int power, double scopeEngine){
        this.power = power;
        this.scopeEngine = scopeEngine;
    }

    public int getPower(){
        return power;
    }
    public double getScopeEngine(){
        return scopeEngine;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setScopeEngine(double scopeEngine) {
        this.scopeEngine = scopeEngine;
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

class Car{
    private int scopeBack, bak;
    private String carBrand;
    private int yearOfManufacture;

    private Whell[] whell;
    private Engine engine;

    public Car(String carBrand, int scopeBack, int yearOfManufacture, int numWhell, int power, double scopeEngine){
        this.carBrand = carBrand;
        this.scopeBack = 0;
        this.yearOfManufacture = yearOfManufacture;
        this.bak = scopeBack;

        whell = new Whell[numWhell];
        for(int i=0; i < numWhell; ++i){
            whell[i] = new Whell(15);
        }

        engine = new Engine(power,scopeEngine);

    }

    public void setWhell(int index, int diametr){
        this.whell[index].setDiameterWhell(diametr);
    }
    public void setAllWhell(int diametr){
        for(int i=0; i < this.whell.length;++i){
            this.whell[i].setDiameterWhell(diametr);
        }
    }
    public int getWhell(int index) {
        return whell[index].getDiameterWhell();
    }
    public void getAllWhell(){
        for(int i=0; i <this.whell.length; ++i){
            System.out.println(this.whell[i].getDiameterWhell());
        }
    }

    public int getScopeBack(){
        return scopeBack;
    }
    public void setScopeBack(int liters){
        if(liters > (this.bak - this.scopeBack)  || liters>this.bak){
            this.scopeBack = this.bak;
        }else{
            this.scopeBack = liters;
        }
    }

    public void drive(int km){
        this.scopeBack -= 10*km;
    }
    public String getCarBrand(){
        return this.carBrand;
    }
}