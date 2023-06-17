import java.util.ArrayList;
import java.util.List;

public class main7 {
    public static List<Integer> insertElements(List<Integer> arr1, List<Integer> arr2) {
        List<Integer> mergedList = new ArrayList<>(arr1);

        for (Integer num : arr2) {
            int left = 0;
            int right = mergedList.size();

            while (left < right) {
                int mid = left + (right - left) / 2;
                if (num < mergedList.get(mid)) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }

            if (left >= mergedList.size()) {
                mergedList.add(num);
            } else {
                mergedList.add(left, num);
            }
        }

        return mergedList;
    }

    public static void main(String[] args) {
        List<Integer> arr1 = List.of(1, 3, 5, 7, 9);
        List<Integer> arr2 = List.of(2, 4,12, 6, 8);

        List<Integer> mergedList = insertElements(arr1, arr2);
        System.out.println(mergedList);
    }
}
