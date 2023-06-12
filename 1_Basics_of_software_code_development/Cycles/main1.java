import java.util.Scanner;
public class main1 {
    public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      try{

          System.out.println("Input number: ");
          if(in.hasNextInt()){
              
              int number = in.nextInt();
              
              if(number > 0 ){
                  int sum = 0;
                  for(int i=1; i <number; ++i){
                      sum+=i;
                  }
                  
                  System.out.println(sum);
                  
              }else{
                  throw new Exception("Number < 0");
              }
              
          }else{
              throw new Exception("Number not int !");
          }
      }catch (Exception ex){
          System.out.println(ex.getMessage());
      }
      
    }
}