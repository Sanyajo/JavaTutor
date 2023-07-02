
import java.util.*;

public class main4 {
    public static void main(String[] args) {

        Client alex = new Client("Alex");

        alex.setBankAccountList("BGZB");
        System.out.println();

        alex.getBankAccountList();
        alex.getBallance("BGZB");
        alex.setNewBallance("BGZB");
        alex.getBallance("BGZB");
        System.out.println();

        alex.cashInBank("BGZB", 1, 1300);
        alex.getBallance("BGZB");


    }
}
class BankAccount{
    private String bankName;
    static int counter = 1;
    private Integer id;
    private Map<Integer,Integer> ballance;

    BankAccount(String bankName){
        this.bankName = bankName;
        this.ballance = new HashMap<>();
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

}

class Client{
    private List<BankAccount> bankAccountList;
    private String clientName;
    Client(String clientName){
        this.clientName = clientName;
        this.bankAccountList = new ArrayList<>();
    }

    public String getClientName(){
        return this.clientName;
    }
    public void setClientName(String clientName){
        this.clientName = clientName;
    }
    public void getBankAccountList() {
        for(BankAccount bankAccount: bankAccountList){
            System.out.println(bankAccount.getBankName());
        }
    }
    public void setBankAccountList(String bankName) {
        boolean check = true;
        for(BankAccount bankAccount : bankAccountList){
            if (bankAccount.getBankName() == bankName){
                System.out.println("Вы уже являетесь клиентом данного банка !");
                check = false;
                break;
            }
        }
        if(check){
            BankAccount bankAccount1 = new BankAccount(bankName);
            bankAccountList.add(bankAccount1);
        }
    }


    public void setNewBallance(String bankName){
        for(BankAccount bankAccount: bankAccountList){
            if(bankAccount.getBankName().equals(bankName)){
                bankAccount.setNewBallance();
            }
        }
    }
    public void getBallance(String bankName){
        for(BankAccount bankAccount: bankAccountList){
            if(bankAccount.getBankName().equals(bankName)){
                bankAccount.getBallance();
            }
        }
    }

    public void cashInBank(String bankName, Integer id, Integer money){
        for(BankAccount bankAccount: bankAccountList){
            if(bankAccount.getBankName().equals(bankName)){
                bankAccount.cashIn(id, money);
            }
        }
    }

}