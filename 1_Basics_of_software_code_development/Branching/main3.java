public class main3 {
    public static void main (String[] args){
      int x_1 = 1; int y_1 = 1;
      int x_2 = 2; int y_2 = 2;
      int x_3 = 3; int y_3 = 3;

      if ((x_3 - x_1) / (x_2 - x_1) == (y_3 - y_1) / (y_2 - y_1)){
          System.out.println("Точки лежат на одной прямой !");
      }else{
          System.out.println("Точки не лежат на одной прямой !");
      }
    }
}