package exercise_5;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

public class Menu<T> {
   private List<Shoping> shopingList;
   private List<Treatment> treatmentList;
   private List<Cruise> cruiseList;

   Menu(){
      this.shopingList = new ArrayList<>();
      this.treatmentList = new ArrayList<>();
      this.cruiseList = new ArrayList<>();
   }

   public void setMenu(Shoping name){
      this.shopingList.add(name);
   }
   public void setMenu(Treatment name){
      this.treatmentList.add(name);
   }
   public void setMenu(Cruise name){
      this.cruiseList.add(name);
   }

   public List<Shoping> getShoping(){
      return shopingList;
   }
   public List<Treatment> getTreatment(){
      return treatmentList;
   }
   public List<Cruise> getCruise(){
      return cruiseList;
   }
   public void showAllMenu(){
      for(Shoping shoping : shopingList){
         System.out.println(shoping.toString());
         System.out.println();
      }
      System.out.println("___________");
      for(Treatment treatment : treatmentList){
         System.out.println(treatment.toString());
         System.out.println();
      }
      System.out.println("___________");
      for(Cruise cruise : cruiseList){
         System.out.println(cruise.toString());
         System.out.println();
      }
      System.out.println("___________");
   }
   public void showMenu(String n){
      String name = n.toLowerCase();
      switch (name){
         case "shoping": {
            for (Shoping shoping : shopingList) {
               System.out.println( shoping.toString());
               System.out.println();
            }
            break;
         }
         case "treatment":{
            for(Treatment treatment : treatmentList){
               System.out.println( treatment.toString());
               System.out.println();
            }
            break;
         }
         case "cruise":{
            for(Cruise cruise : cruiseList){
               System.out.println( cruise.toString());
               System.out.println();
            }
            break;
         }
         default:{
            System.out.println("не корректный ввод !");
         }
      }
   }


}
