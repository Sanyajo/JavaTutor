package exercise_5;
import java.util.*;

public class Client<T> {
    private String name;

    private Menu menu;
    Client(String name, Menu menu){
        this.name = name;
        this.menu = menu;
    }

    public void wybor(String nameTur, Object feeding, Object kollday){
        String name = nameTur.toLowerCase();
        switch (name){
            case "shoping": {
                List<Shoping> list = menu.getShoping();
                for(var i : list){
                    if(i.getFeeding().equals(feeding) && i.getKollDay().equals(kollday)){
                        System.out.println(i);
                    }
                }
                break;
            }
            case "treatment":{
                List<Treatment> list = menu.getTreatment();
                for(var i : list){
                    if(i.getFeeding().equals(feeding) && i.getKollDay().equals(kollday)){
                        System.out.println(i.toString());
                    }
                }
                break;
            }
            case "cruise":{
                List<Cruise> list = menu.getCruise();
                for(var i : list){
                    if(i.getFeeding().equals(feeding) && i.getKollDay().equals(kollday)){
                        System.out.println(i.toString());
                    }
                }
                break;
            }
            default:{
                System.out.println("не корректный ввод !");
            }
        }
    }

}
