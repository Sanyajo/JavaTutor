import java.util.*;

public class main8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
            Customer c1 = new Customer("Alex","elx","lx","wdasd","1234","12345");
            Customer c2 = new Customer("NoAlex","elx","lx","wdasd","12345","12345");
            Customer c3 = new Customer("Botrkjgt","elx","lx","wdasd","1234","12345");

            List<Customer> customers = new ArrayList<>();
            customers.add(c1);
            customers.add(c2);
            customers.add(c3);

            Bank bank = new Bank();
            bank.setCustomers(customers);
            bank.surNameSort();
            for(Customer cust: bank.getCustomers()){
                System.out.println(cust);
            }

            bank.cardWyb(1234, 12341);


        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

}
class Customer implements Comparable<Customer>{
    private static int count=1;
    private int id;
    private String surName, firstName, middleName, address;
    private String creditCardNumber, accountNumber;
    {
        id = count;
        count++;
    }
    public int compareTo(Customer otherCustomer){
        return this.surName.compareTo(otherCustomer.getSurName());
    }

    Customer(String surName, String firstName, String middleName, String address, String creditCardNumber, String accountNumber){
        this.surName = surName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.accountNumber = accountNumber;
    }
    public int getId(){
        return this.id;
    }
    public String getSurName(){
        return this.surName;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getMiddleName(){
        return this.middleName;
    }
    public String getAddress(){
        return this.address;
    }
    public String getCreditCardNumber(){
        return this.creditCardNumber;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }

    public void setSurName(String surName){
        this.surName = surName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setMiddleName(String middleName){
        this.middleName = middleName;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setCreditCardNumber(String creditCardNumber){
        this.creditCardNumber = creditCardNumber;
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public String toString(){
        return "id: " + this.id
                +"\nФИО: " + this.surName + " " + this.firstName + " " + this.middleName
                +"\nАдрес: " + this.address
                +"\nНомер кредитной карточки: " + this.creditCardNumber
                +"\nНомер банковского счета: " + this.accountNumber
                +"\n__________________________";
    }
}

class Bank{
    List<Customer> customers;
    public Bank(){
    }

    public void setCustomers(List<Customer> customers){
        this.customers = customers;
    }
    public void surNameSort(){
        customers.sort(null);
    }

    public void cardWyb(int start, int end){
        for(Customer cust: customers){
            if(Long.parseLong(cust.getCreditCardNumber()) >= start && Long.parseLong(cust.getCreditCardNumber())<=end){
                System.out.println(cust);
            }
        }
    }
    public List<Customer> getCustomers(){
        return customers;
    }

}