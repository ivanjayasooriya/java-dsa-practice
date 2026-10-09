package dsa;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int size = 4;
        int currentSum = 0;

        for (int i = 0; i < size; i++) {
            currentSum += arr[i];
        }

        int maxSum = currentSum;

        for (int i = size; i < arr.length; i++) {
            currentSum += arr[i];
            currentSum -= arr[i - size];

            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        System.out.println("Max sum: " + maxSum);
    }
}
