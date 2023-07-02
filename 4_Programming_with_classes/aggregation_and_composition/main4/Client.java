package study;

import java.util.ArrayList;
import java.util.List;

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

    public void searchBank(Integer number){
        for (BankAccount bankAccount : bankAccountList){
            bankAccount.searchBallance(number);
        }
    }

    public void cashInBank(String bankName, Integer id, Integer money){
        for(BankAccount bankAccount: bankAccountList){
            if(bankAccount.getBankName().equals(bankName)){
                bankAccount.cashIn(id, money);
            }
        }
    }

    public int allCash(){
        int sum = 0 ;
        for(BankAccount bankAccount : bankAccountList){
            sum+= bankAccount.allCash();
        }
        return sum;
    }

    public int allPlusCash(){
        int sum = 0;
        for(BankAccount bankAccount : bankAccountList){
            sum+= bankAccount.allPlusCash();
        }
        return sum;
    }
    public int allMinCash(){
        int sum = 0;
        for(BankAccount bankAccount : bankAccountList){
            sum+= bankAccount.allMinCash();
        }
        return sum;
    }

    public void sortCash(){
        for(BankAccount bankAccount : bankAccountList){
            bankAccount.sortCash();
        }
    }

    public void blockCash(String bankName){
        for(BankAccount bankAccount : bankAccountList){
            bankAccount.blockCash();
        }
    }
    public void unBlockCash(String bankName){
        for(BankAccount bankAccount : bankAccountList){
            bankAccount.unBlockCash();
        }
    }
}