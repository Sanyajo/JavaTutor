import java.util.*;
import java.time.LocalDate;

public class main4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Train tr1 = new Train("Moscow",11,"2023-03-11");
        Train tr2 = new Train("Belarus",13,"2023-01-23");
        Train tr3 = new Train("Kiev",32,"2023-04-12");
        Train tr4 = new Train("USA",31,"2023-05-15");
        Train tr5 = new Train("Poland",31,"2023-01-14");

        List <Train> list = new ArrayList<>();
        list.add(tr1);
        list.add(tr2);
        list.add(tr3);
        list.add(tr4);
        list.add(tr5);

        sortTrainNumber(list);

        System.out.println("Введите номер поезда: ");
        int number = in.nextInt();
        viewInfo(list,number);

        sortDestinationName(list);
        sortTrainNumber(list);

    }

    public static void sortTrainNumber(List list){
        Collections.sort(list);
        System.out.println(list.toString());
    }

    public static void viewInfo(List<Train> list, int number){
       for(Train train : list){
           if(train.getTrainNumber() == number){
               System.out.println(train.toString());
           }
       }
    }

    public static void sortDestinationName(List<Train> list) {
        int j;
        for (int i = 1; i < list.size(); ++i) {
            Train train = list.get(i);
            int month = train.getMonth();
            int day = train.getDay();
            String destination = train.getDestinationName();

            j = i - 1;
            while (j >= 0 && (list.get(j).getMonth() > month || (list.get(j).getMonth() == month && list.get(j).getDay() > day))) {
                list.set(j + 1, list.get(j));
                j--;
            }

            list.set(j + 1, train);
        }
    }
    
    public static void printList(List<Train> list){
        System.out.println(list.toString());
    }
    
}



class Train implements Comparable<Train>{
    private String destinationName;
    private int trainNumber;
    private String date;

    public Train(String destinationName, int trainNumber, String date){
        this.destinationName = destinationName;
        this.trainNumber = trainNumber;
        this.date = date;
    }

    public String getDestinationName(){
        return this.destinationName;
    }
    public int getTrainNumber() {
        return this.trainNumber;
    }
    public String getDate(){
        return this.date;
    }

    public void setDestinationName(String destinationName){
        this.destinationName = destinationName;
    }

    public void setTrainNumber(int trainNumber){
        this.trainNumber = trainNumber;
    }

    public void setDate(String date){
        this.date = date;
    }

    @Override
    public int compareTo(Train o) {
        return this.getTrainNumber() - o.getTrainNumber();
    }

    public String toString(){
        return destinationName + " " + trainNumber + " " + date + "\n";
    }

    public int getYear(){
        LocalDate dt = LocalDate.parse(date);
        return dt.getYear();
    }
    public int getMonth(){
        LocalDate dt = LocalDate.parse(date);
        return dt.getMonthValue();
    }
    public int getDay(){
        LocalDate dt = LocalDate.parse(date);
        return dt.getDayOfMonth();
    }

}
