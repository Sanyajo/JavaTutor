
public class main14 {
    public static void main(String[] args) {
        int[][] arr = new int [4][5];

        for(int i = 0; i < arr.length; ++i){
            for(int j =0; j < arr[i].length; ++j){
                if(i <= j){
                    arr[i][j] = 1;
                }
                else{
                    arr[i][j] = 0;
                }
            }
        }
        print_arr(arr);

    }

    public static void print_arr(int[][] arr){
        for(int i = 0; i < arr.length; ++i){
            for(int j =0; j < arr[i].length; ++j){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }


}


