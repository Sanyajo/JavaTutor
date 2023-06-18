public class main2 {
    public static void main(String[] args) {

        int[] arr1 = {4,4,3,9};
        int[] arr2 = {3,3,6,9};

        NOD nd1 = new NOD(arr1);
        NOD nd2 = new NOD(arr2);

        System.out.println("NOD: " + nd1.getNOD());
        System.out.println("NOD: " + nd2.getNOD());

    }
}

class NOD{
    private int[] arr;
    protected NOD(int[] arr){
       this.arr = arr;
    }

    private static int find_min(int[] arr){
        int min = arr[0];
        for(int i=1; i < arr.length; ++i){
            if ( min > arr[i] )
                min = arr[i];
        }
        return min;
    }

    public int getNOD(){
        int min = find_min(arr);
        return find_nod(arr,min);
    }

    private static int find_nod(int[] arr, int div){
        for(int i=0; i < arr.length; ++i){
            if(arr[i] % div !=0)
                return find_nod(arr, div-1);
        }
        return div;
    }
}

