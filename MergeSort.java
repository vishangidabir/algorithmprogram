package com.bridgelabz;

public class MergeSort {
    private void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // Find the middle point
            int mid = (left + right) / 2;

            // Sort first and second halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    private void merge(int[] arr, int left, int mid, int right) {
        // Find sizes of two sub-arrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temp arrays
        int Left[] = new int[n1];
        int Right[] = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            Left[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            Right[j] = arr[mid + 1 + j];

        int i = 0, j = 0;

        // Initial index of merged sub-array array
        int k = left;
        while (i < n1 && j < n2) {
            if (Left[i] <= Right[j]) {
                arr[k] = Left[i];
                i++;
            } else {
                arr[k] = Right[j];
                j++;
            }
            k++;
        }
        // Copy remaining elements of Left[] array
        while (i < n1) {
            arr[k] = Left[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] array
        while (j < n2) {
            arr[k] = Right[j];
            j++;
            k++;
        }
    }

    private void PrintArray(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 9, 4, 7, 6, 3, 1, 5 };
        int low = 0, high = arr.length - 1;
        int mid = (low + high) / 2;
        MergeSort mergesort = new MergeSort();

        System.out.println("Before sorting");
        mergesort.PrintArray(arr);

        mergesort.mergeSort(arr, 0, arr.length - 1);
        System.out.println("After sorting");
        mergesort.PrintArray(arr);
    }
}
