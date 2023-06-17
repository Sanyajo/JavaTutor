import java.util.Arrays;

public class main2 {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 6, 7, 8};
        int[] array2 = {2, 3, 4, 7, 10};
        int size = array1.length;

        array1 = resizeArray(array1, array1.length + array2.length);

        System.arraycopy(array2 ,0, array1, size,array2.length );
        Arrays.sort(array1);

        for(var i : array1){
            System.out.print(i + " ");
        }
    }
    public static int[] resizeArray(int[] array, int newSize) {
        int[] newArray = new int[newSize];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }
}
