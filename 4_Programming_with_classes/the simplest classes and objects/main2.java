public class main2 {
    public static void main(String[] args) {
        Test1 t = new Test1();

        System.out.println("Число а:\t" + t.getA());
        System.out.println("Число b:\t" + t.getB());

        t.setA(1);
        t.setB(2);
        System.out.println();

        System.out.println("Число а:\t" + t.getA());
        System.out.println("Число b:\t" + t.getB());
    }
}

class Test1{
    private int a, b;

    Test1(){
        this.a = 0;
        this.b = 0;
    }

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
