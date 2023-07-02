package study;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

class BankAccount{
    private String bankName;
    static int counter = 1;
    private Integer id;
    private Map<Integer,Integer> ballance;
    private boolean check;

    BankAccount(String bankName){
        this.bankName = bankName;
        this.ballance = new HashMap<>();
        this.check = true;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void getBallance(){
        if(ballance.size() == 0){
            System.out.println("У вас нету счета в этом банке !");
        }else{
            for(Map.Entry<Integer, Integer> entry : ballance.entrySet()){
                System.out.println("Номер балланса: " + entry.getKey());
                System.out.println("Балланса: " + entry.getValue());
            }
        }
    }

    public void setNewBallance(){
        id = counter;
        ballance.put(id,0);
        counter++;
    }

    public void cashIn(Integer number, Integer money){
        Integer temp = ballance.get(number);
        if(temp != null){
            int newWalue = money + temp;
            ballance.put(number, newWalue);
        }else{
            System.out.println("Error");
        }
    }

    public void searchBallance(Integer number){
        for(Map.Entry<Integer, Integer> entry : ballance.entrySet()){
            if(entry.getKey().equals(number)){
                System.out.println("Номер балланса: " + entry.getKey());
                System.out.println("Балланса: " + entry.getValue());
            }
        }
    }

    public int allCash(){
        int sum = 0;
        for(Map.Entry<Integer, Integer> entry : ballance.entrySet()){
            sum+=entry.getValue();
        }
        return sum;
    }

    public int allPlusCash(){
        int sum = 0;
        for(Map.Entry<Integer, Integer> entry : ballance.entrySet()){
            if(entry.getValue() > 0){
                sum+=entry.getValue();
            }
        }
        return sum;
    }
    public int allMinCash(){
        int sum = 0;
        for(Map.Entry<Integer, Integer> entry : ballance.entrySet()){
            if(entry.getValue() < 0){
                sum+=Math.abs(entry.getValue());
            }
        }
        return sum;
    }

    public void sortCash(){
        Map<Integer, Integer> sortedMap = new LinkedHashMap<>();
        ballance.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(entry -> sortedMap.put(entry.getKey(), entry.getValue()));
    }

    public void blockCash(){
        this.check = false;
    }

    public void unBlockCash(){
        this.check = true;
    }

}