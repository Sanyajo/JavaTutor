package study;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Client alex = new Client("Alex");

        alex.setBankAccountList("BGZB");
        alex.setBankAccountList("Alfa");
        alex.setNewBallance("BGZB");
        alex.setNewBallance("BGZB");
        alex.setNewBallance("Alfa");

        alex.getBallance("BGZB");
        alex.getBallance("Alfa");
        System.out.println();

        alex.cashInBank("BGZB", 1, 1300);
        alex.cashInBank("BGZB", 2, -1300);
        alex.cashInBank("Alfa", 3, 1);

        alex.searchBank(1);
        alex.searchBank(2);
        alex.searchBank(3);

        System.out.println(alex.allMinCash());
        System.out.println(alex.allPlusCash());


        alex.blockCash("Alfa");

    }
}
