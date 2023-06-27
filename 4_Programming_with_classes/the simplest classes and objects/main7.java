import java.util.*;

public class main7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
            Treangle tr1 = new Treangle(new double[][] { {2,1}, {3,3}, {4,2} } );
            System.out.println("P: "+ tr1.perimeter());
            System.out.println("S: "+ tr1.square());
            System.out.println("Merid: "+ Arrays.toString(tr1.merid()));
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }

}

class Treangle{
    private double[][] ABC;
    private double AB, AC, CB;

    Treangle(double[][] ABC) throws Exception {
        if (ABC.length > 3) {
            throw new Exception("Такой треугольник не может существовать!");
        }else{
            double AB = Math.sqrt((Math.pow(ABC[1][0] - ABC[0][0], 2)) + (Math.pow(ABC[1][1] - ABC[0][1], 2)));
            double AC = Math.sqrt((Math.pow(ABC[2][0] - ABC[1][0], 2)) + (Math.pow(ABC[2][1] - ABC[1][1], 2)));
            double CB = Math.sqrt((Math.pow(ABC[2][0] - ABC[0][0], 2)) + (Math.pow(ABC[2][1] - ABC[0][1], 2)));

            if ((AB + AC) > CB && (AC + CB) > AB && (AB + CB) > AC) {
                this.AB = AB;
                this.AC = AC;
                this.CB = CB;
                this.ABC = ABC;
            } else {
                throw new Exception("Такой треугольник не может существовать!");
            }
        }
    }
    public double square(){
        double temp = perimeter()/2;
        return (Math.sqrt(temp* (temp-this.AB) * (temp-this.AC) * (temp-this.CB) ) );
    }

    public double perimeter(){
        return AB+AC+CB;
    }

    public double[] merid(){
        double[] mer = new double[2];
        mer[0] = (ABC[0][0] + ABC[1][0] + ABC[2][0])/3;
        mer[1] = (ABC[0][1] + ABC[1][1] + ABC[2][1])/3;
        return mer;
    }
}