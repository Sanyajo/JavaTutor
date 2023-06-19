
public class Main {
    public static void main(String[] args) {
        Quadrangle q1 = new Quadrangle(2,3,4,5);
        q1.printSide();

        System.out.println("S = " +    q1.square() );
    }
}

class Quadrangle{
    private double A, B, C, D;

    protected Quadrangle(double A, double B, double C, double D){
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }

    protected void printSide(){
        System.out.println("Cторона А: " + A);
        System.out.println("Cторона B: " + B);
        System.out.println("Cторона C: " + C);
        System.out.println("Cторона D: " + D);
    }

    protected double square(){
        double diag = Math.sqrt(Math.pow(A,2) + Math.pow(B,2));

        double per_s1 = (A + B + diag);
        double s1 = Math.sqrt( (per_s1 * (per_s1 - A) * (per_s1 - B) *(per_s1 - diag)) );

        double per_s2 = (C + D + diag);
        double s2 = Math.sqrt( (per_s2 * (per_s2 - C) * (per_s2 - D) *(per_s2 - diag)) );

        return s1 + s2;
    }

    protected double getA(){
        return A;
    }
    protected void setA(double A){
        this.A = A;
    }

    protected double getB(){
        return B;
    }
    protected void setB(double B){
        this.B = B;
    }

    protected double getC(){
        return C;
    }
    protected void setC(double C){
        this.C = C;
    }

    protected double getD(){
        return D;
    }
    protected void setD(double D){
        this.D = D;
    }
}


