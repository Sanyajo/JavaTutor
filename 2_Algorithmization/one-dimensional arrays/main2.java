import java.util.Scanner;

public class main2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.print("Введите Z: ");
        int Z = in.nextInt();

        for(int i=0; i<arr.length; ++i){
            arr[i] = (int)(1+Math.random()*10);
        }

        System.out.println("Старый массив");
        for(int i : arr){
            System.out.print(i + " ");
        }

        int j = 0;
        for(int i = 0; i < arr.length; ++i){
            if(arr[i] > Z){
                arr[i] = Z;
                j++;
            }
        }

        System.out.println("\nНовый массив массив");
        for(int i : arr){
            System.out.print(i + " ");
        }

        System.out.println("\nЗамен : " + j);
    }
}

