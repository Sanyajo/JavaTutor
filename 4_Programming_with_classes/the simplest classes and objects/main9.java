import java.util.*;

public class main9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
            Book book1 = new Book("Я","ЮНИСЕФ","Твердый",2022,11,10.90);
            Book book2 = new Book("Друг","ФиСЭ","Мягкий",2003,101,11);
            Book book3 = new Book("Я","Уникс","Твердый",2011,12,23.99);

            List<Book> books = new ArrayList<>();
            books.add(book1);
            books.add(book2);
            books.add(book3);

            Library library = new Library();
            library.setBooks(books);

            library.sortYear(2003);


        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

}

class Book{
    private static int count=1;
    private int id;
    private String title, publisher,typeOfBinding;
    private int  year, numberPage;
    private double price;
    {
        id = count;
        count++;
    }

    Book(String title, String publisher, String typeOfBinding, int year, int numberPage,double price){
        this.title = title;
        this.publisher = publisher;
        this.typeOfBinding = typeOfBinding;
        this.year = year;
        this.numberPage = numberPage;
        this.price = price;
    }
    public int getId(){
        return this.id;
    }
    public String getTitle(){
        return this.title;
    }
    public String getPublisher(){
        return this.publisher;
    }
    public int getYear(){
        return this.year;
    }
    public int getNumberPage(){
        return this.numberPage;
    }
    public double getPrice(){
        return this.price;
    }
    public String getTypeOfBinding(){
        return this.typeOfBinding;
    }


    public void setTitle(String title){
        this.title = title;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setTypeOfBinding(String typeOfBinding){
        this.typeOfBinding = typeOfBinding;
    }
    public void setNumberPage(int numberPage) {
        this.numberPage = numberPage;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public String toString(){
        return "id: " + this.id
                +"\nАвтор: " + this.title
                +"\nИздательство: " + this.publisher
                +"\nГод издания: " + this.year
                +"\nКоличество страниц: " + this.numberPage
                +"\nЦена: " + this.price
                +"\nТип переплета: " + this.typeOfBinding
                +"\n__________________________";
    }
}

class Library{
    List<Book> books;
    public Library(){
    }

    public void setBooks(List<Book> books){
        this.books = books;
    }

    public void searchTitle(String title){
        for(Book bk : books){
            if(bk.getTitle(). equalsIgnoreCase(title)){
                System.out.println(bk);
            }
        }
    }
    public void searchPublisher(String publisher){
        for(Book bk : books){
            if(bk.getPublisher(). equalsIgnoreCase(publisher)){
                System.out.println(bk);
            }
        }
    }

    public void sortYear(int year){
        for(Book bk : books){
            if(bk.getYear() > year){
                System.out.println(bk);
            }
        }
    }

}