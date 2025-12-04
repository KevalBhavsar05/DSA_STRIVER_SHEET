package SortingAlgorithms;

import java.util.Arrays;

public class QuickSort {
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = 0, j = high;
        int temp;
        
        // find the correct position for pivot  
        while (i < j) {
            while (arr[i] <= pivot && i < high)
                i++;
            while (arr[j] > pivot && j > low)
                j--;
            if (i < j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // put the pivot at its correct position
        temp = arr[j];
        arr[j] = arr[low];
        arr[low] = temp;

        return j;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 2, 6, 8, 2, 3, 5 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
