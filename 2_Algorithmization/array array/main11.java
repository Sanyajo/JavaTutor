public class main11 {
    public static void main(String[] args) {
        int[][] arr = new int[10][20];

        for(int i =0; i < arr.length; ++i){
            int koll = 0 ;
            for(int j = 0; j < arr[i].length; ++j){
                arr[i][j] =(int)(Math.random()*15) + 0;
                if ( arr[i][j] == 5){
                    koll++;
                }
            }
            if(koll >= 3){
                System.out.println("row number: " + (i+1));
            }
        }
        System.out.println();
        pr_arr(arr);
    }

    public static void pr_arr(int[][] arr){
        for(int i =0; i < arr.length; ++i){
            for(int j = 0; j < arr[i].length; ++j){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}


