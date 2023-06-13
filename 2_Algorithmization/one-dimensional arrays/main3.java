import java.util.Scanner;

public class main3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Введите N: ");
        int N = in.nextInt();
        int[] arr = new int[N];

        for(int i=0; i<arr.length; ++i){
            arr[i] = (int)((Math.random()*20) - 10);
        }

        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
        int pos_num = 0 , neg_num = 0, zer_num = 0;
        for(int i : arr){
            if( i > 0){
                pos_num++;
            }else if (i<0){
                neg_num++;
            }else{
                zer_num++;
            }
        }

        System.out.println("Позитивных чисел " + pos_num);
        System.out.println("Отрицательных чисел " + neg_num);
        System.out.println("Нулевых чисел " + zer_num);

    }
}

