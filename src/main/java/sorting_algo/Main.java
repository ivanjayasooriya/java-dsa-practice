package sorting_algo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {4,6,3,2,1,9,7};

        int[] sortedArray = bubbleSort(array);
        System.out.println("Bubble Sort: " + Arrays.toString(sortedArray));

        sortedArray = selectionSort(array);
        System.out.println("Selection Sort: " + Arrays.toString(sortedArray));

        sortedArray = insertionSort(array);
        System.out.println("Insertion Sort: " + Arrays.toString(sortedArray));
    }

    static int[] bubbleSort(int[] arr) {
        boolean swapped = false;
        int temp;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i -1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return arr;
    }

    static int[] selectionSort(int[] arr) {
        int minIndex;

        for (int i = 0; i < arr.length - 1; i++) {
            minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        return arr;
    }

    static int[] insertionSort(int[] arr) {
        int valueToInsert;
        int holePosition;

        for (int i = 1; i < arr.length; i++) {
            valueToInsert = arr[i];
            holePosition = i;

            while (holePosition > 0 && arr[i - 1] > valueToInsert) {
                arr[holePosition] = arr[holePosition - 1];
                holePosition--;
            }

            if (holePosition != i) {
                arr[holePosition] = valueToInsert;
            }
        }
        return arr;
    }
}
