package com.bridgelabz;

public class MergeSort {
    private void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            // Find the middle point
            int mid = (left + right) / 2;

            // Sort first and second halves
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);

            // Merge the sorted halves
            merge(array, left, mid, right);
        }
    }

    private void merge(int[] array, int left, int mid, int right) {
        // Find sizes of two sub-arrays to be merged
        int length1 = mid - left + 1;
        int length2 = right - mid;

        // Create temp arrays
        int Left[] = new int[length1];
        int Right[] = new int[length2];

        // Copy data to temp arrays
        for (int i = 0; i < length1; ++i)
            Left[i] = array[left + i];
        for (int j = 0; j < length2; ++j)
            Right[j] = array[mid + 1 + j];

        int i = 0, j = 0;

        // Initial index of merged sub-array array
        int k = left;
        while (i < length1 && j < length2) {
            if (Left[i] <= Right[j]) {
                array[k] = Left[i];
                i++;
            } else {
                array[k] = Right[j];
                j++;
            }
            k++;
        }
        // Copy remaining elements of Left[] array
        while (i < length1) {
            array[k] = Left[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] array
        while (j < length2) {
            array[k] = Right[j];
            j++;
            k++;
        }
    }

    private void PrintArray(int[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = { 9, 4, 7, 6, 3, 1, 5 };
        int low = 0, high = array.length - 1;
        int mid = (low + high) / 2;
        MergeSort mergesort = new MergeSort();

        System.out.println("Before sorting");
        mergesort.PrintArray(array);

        mergesort.mergeSort(array, 0, array.length - 1);
        System.out.println("After sorting");
        mergesort.PrintArray(array);
    }
}
