package SortingAlgorithms;

import java.util.Arrays;

public class CountingSort {
    public static int maxOfArray(int[] arr) {
        if (arr.length == 0)
            return -1;
        else {
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max)
                    max = arr[i];
            }
            return max;
        }
    }

    public static void countingSort(int[] arr) {
        int k = maxOfArray(arr);
        int[] temp = new int[k + 1];
        int[] tempArr = new int[arr.length];

        /*
         * Counting how many time the same element occur in array and store count in
         * temp
         */
        for (int i = 0; i < arr.length; i++) {
            temp[arr[i]]++;
        }

        // giving index to elements
        for (int i = 1; i < temp.length; i++) {
            temp[i] += temp[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            --temp[arr[i]];
            tempArr[temp[arr[i]]] = arr[i];
        }

        for (int i = 0; i < tempArr.length; i++) {
            arr[i] = tempArr[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 2, 3, 5, 2, 7, 8, 8, 1, 1, 4, 5, 9 };
        countingSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
/*
 * Conditions for Counting Sort
 * These are the reasons why Counting Sort is said to only work for a limited
 * range of non-negative integer values:
 * 
 * Integer values: Counting Sort relies on counting occurrences of distinct
 * values, so they must be integers. With integers, each value fits with an
 * index (for non negative values), and there is a limited number of different
 * values, so that the number of possible different values
 * k
 * is not too big compared to the number of values
 * n
 * .
 * Non negative values: Counting Sort is usually implemented by creating an
 * array for counting. When the algorithm goes through the values to be sorted,
 * value x is counted by increasing the counting array value at index x. If we
 * tried sorting negative values, we would get in trouble with sorting value -3,
 * because index -3 would be outside the counting array.
 * Limited range of values: If the number of possible different values to be
 * sorted
 * k
 * is larger than the number of values to be sorted
 * n
 * , the counting array we need for sorting will be larger than the original
 * array we have that needs sorting, and the algorithm becomes ineffective.
 */