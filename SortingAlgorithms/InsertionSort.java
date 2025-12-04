package SortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 2, 3, 5, 2, 7, 8, 8, 1, 1, 4, 5, 9 };
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

/*
 * Time Complexity
 * 
 * Best case: O(n), If the list is already sorted, where n is the number of
 * elements in the list.
 * Average case: O(n2), If the list is randomly ordered
 * Worst case: O(n2), If the list is in reverse order
 * 
 * 
 * Space Complexity
 * 
 * Auxiliary Space: O(1), Insertion sort requires O(1) additional space, making
 * it a space-efficient sorting algorithm.
 * 
 * Stable sorting algorithm.
 * Yes, insertion sort is an in-place sorting algorithm.
 */