public class main1 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5}; 
        int[] array2 = {6, 7, 8, 9, 10};
        int k = 2; 

        array1 = resizeArray(array1, array1.length + array2.length);
        
        for (int i = array1.length - 1 - array2.length; i >= k; i--) {
            array1[i + array2.length] = array1[i];
        }


        for (int i = 0; i < array2.length; i++) {
            array1[k + 1 + i] = array2[i];
        }
        
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
    }
    public static int[] resizeArray(int[] array, int newSize) {
        int[] newArray = new int[newSize];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }
}
