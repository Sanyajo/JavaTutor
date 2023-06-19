public class main4 {
    public static void main(String[] args) {
        int[] arr = {0,3,3,1,7};
        System.out.println(findMaxRast(arr));
    }
    public static int findMaxRast(int[] arr){
        int temp = 0;
        for(int i = 0; i < arr.length; ++i){
            for(int j=i+1; j < arr.length; ++j){
                if(Math.abs( (arr[i] - arr[j]) ) >= temp){
                    temp = Math.abs( (arr[i] - arr[j]) );
                }
            }
        }
        return temp;
    }
}


