package dsa;

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int size = 4;
        int maxSum = 0;

        for (int i = 0; i < size; i++) {
            maxSum += arr[i];
        }

        int sum = maxSum;

        for (int i = size; i < arr.length; i++) {
            sum += arr[i];
            sum -= arr[i - size];

            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        System.out.println("Max sum: " + maxSum);
    }
}
