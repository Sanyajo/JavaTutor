import java.util.Arrays;
import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student[] array = new Student[3];
        for(int i=0; i<3; ++i){
            String fullName = in.nextLine();
            String groupName = in.nextLine();
            array[i] = new Student(fullName,groupName,funct());
        }
        search(array);
    }

    public static int[] funct(){
        int[] arr = new int[5];
        for(int i=0; i <5; ++i){
            arr[i] = (int)(Math.random()*10)+1;
        }
        return arr;
    }

    public static void search(Student[] array){
        for(int i=0; i <array.length; ++i){
            int[] buf = array[i].getArr();
            boolean check = false;
            for(int j=0; j <buf.length; ++j){
                if(buf[j] != 9 && buf[j] != 10){
                    break;
                }else{
                    check = true;
                }
            }
            if(check){
                System.out.println(array[i].getFullName());
                System.out.println(array[i].getGroupNumber());
                System.out.println(Arrays.toString(buf));
            }
        }
    }
}

class Student{
    private String fullName;
    private String groupNumber;
    private int[] arr;

    Student(String fullname, String groupname, int[] arr){
        this.fullName = fullname;
        this.groupNumber = groupname;
        this.arr = arr;
    }

    public String getFullName(){
        return this.fullName;
    }
    public String getGroupNumber(){
        return this.groupNumber;
    }
    public int[] getArr(){
        return this.arr;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public void setGroupNumber(String groupNumber){
        this.groupNumber = groupNumber;
    }
    public void setArr(int[] arr){
        this.arr = arr;
    }

}

