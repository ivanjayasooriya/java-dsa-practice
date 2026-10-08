package dsa;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};

//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    System.out.println("Duplicate found at indices: " + i + ", " + j);
//                    return;
//                }
//            }
//        }

        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num)) {
                System.out.println("Duplicate found: " + num);
                return;
            }

            set.add(num);
        }
    }
}
