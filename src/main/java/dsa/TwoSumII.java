package dsa;

public class TwoSumII {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println("Found the target: " + target);
                System.out.println("Indices: " + left + ", " + right);
                return;
            }

            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
    }
}
