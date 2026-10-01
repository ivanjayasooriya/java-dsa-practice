package sorting_algo;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {4,6,3,2,1,9,7};

        sort(arr);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void sort(int[] arr) {
        if (arr.length < 2) return;
        mergeSort(arr, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int[] L = new int[mid - left + 1];
        int[] R = new int[right - mid];

        System.arraycopy(arr, left, L, 0, L.length);
        System.arraycopy(arr, mid + 1, R, 0, R.length);

        int i = 0, j = 0, k = left;

        while (i < L.length && j < R.length) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < L.length) arr[k++] = L[i++];
        while (j < R.length) arr[k++] = R[j++];
    }
}
