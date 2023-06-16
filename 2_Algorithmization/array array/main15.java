
public class main15 {
    public static void main(String[] args) {
        int[][] arr = new int [4][5];

        for(int i = 0; i < arr.length; ++i){
            for(int j =0; j < arr[i].length; ++j){
                arr[i][j] = (int) (Math.random()*6)+1;
            }
        }
        print_arr(arr);
        System.out.println();

        int max;
        max = find_max(arr);
        System.out.println("Max: "+ max);

        for(int i = 0; i < arr.length; ++i){
            for(int j =0; j < arr[i].length; ++j){
                if(arr[i][j] %2 != 0) {
                    arr[i][j] = max;
                }
            }
        }

        print_arr(arr);
        System.out.println();

    }

    public static void print_arr(int[][] arr){
        for(int i = 0; i < arr.length; ++i){
            for(int j =0; j < arr[i].length; ++j){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int find_max(int[][] arr){
        int max = 0;
        for(int i=0; i < arr.length; ++i){
            for(int j=0; j< arr[i].length; ++j){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }

}


