package SortingAlgorithms;

import java.util.Arrays;

public class RadixSort {

    public static int getMax(int arr[], int n) {
        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }

    public static void countSort(int[] arr, int n, int exp) {
        int[] output = new int[n];
        int[] count = new int[10];

        for (int i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;

        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        for (int i = 0; i < n; i++)
            arr[i] = output[i];
    }

    public static void radixSort(int[] arr) {
        int n = arr.length;
        int m = getMax(arr, n);
        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(arr, n, exp);
    }

    public static void main(String[] args) {
        int[] arr = { 0, 2, 3, 5, 2, 7, 8, 8, 1, 1, 4, 5, 9 };
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

/*
 * Time Complexity:
 * 
 * Radix sort is a non-comparative integer sorting algorithm that sorts data
 * with integer keys by grouping the keys by the individual digits which share
 * the same significant position and value. It has a time complexity of O(d * (n
 * + b)), where d is the number of digits, n is the number of elements, and b is
 * the base of the number system being used.
 * In practical implementations, radix sort is often faster than other
 * comparison-based sorting algorithms, such as quicksort or merge sort, for
 * large datasets, especially when the keys have many digits. However, its time
 * complexity grows linearly with the number of digits, and so it is not as
 * efficient for small datasets.
 * 
 * 
 * Auxiliary Space:
 * 
 * Radix sort also has a space complexity of O(n + b), where n is the number of
 * elements and b is the base of the number system. This space complexity comes
 * from the need to create buckets for each digit value and to copy the elements
 * back to the original array after each digit has been sorted.
 */