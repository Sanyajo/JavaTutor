public class main1 {
    public static void main(String[] args) {
        Test1 t = new Test1();

        t.setA(2);
        t.setB(2);
        System.out.println("Число а:\t" + t.getA());
        System.out.println("Число b:\t" + t.getB());

        System.out.println("Сумма :\t" + t.sum(t.getA(), t.getB()));

        t.setB(3);
        System.out.println("Наибольшее число между " + t.getA() + " и " + t.getB() + " = " + t.largest(t.getA(), t.getB()));
    }
}

class Test1{
    private int a, b;

    public int getA(){
        return this.a;
    }
    public int getB(){
        return this.b;
    }

    public void setA(int a){
        this.a = a;
    }
    public void setB(int b){
        this.b = b;
    }

    public int sum(int a, int b){
        return a+b;
    }

    public int largest(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }

}
