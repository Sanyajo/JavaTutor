package exercise_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Treatment treatment1 = new Treatment("Bus", 3, 14);
        Treatment treatment2 = new Treatment("Bus", 3, 12);

        Shoping shoping1 = new Shoping("Car", 1, 5);
        Shoping shoping2 = new Shoping("Car", 2, 1);

        Cruise cruise1 = new Cruise("Ship", 3, 14);
        Cruise cruise2 = new Cruise("Ship", 3, 31);

        Menu menu = new Menu();
        menu.setMenu(cruise1);
        menu.setMenu(cruise2);
        menu.setMenu(shoping1);
        menu.setMenu(shoping2);
        menu.setMenu(treatment1);
        menu.setMenu(treatment2);

//        menu.showAllMenu();
//        menu.showMenu("Cruise");
        Client client = new Client("Alex", menu);
        client.wybor("shoping", 1,5);





    }
}
