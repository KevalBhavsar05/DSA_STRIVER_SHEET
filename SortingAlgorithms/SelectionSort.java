package SortingAlgorithms;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int temp, minIndex;
        for (int i = 0; i < arr.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
        }

        System.out.println("Before Sorting: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("After Sorting: ");
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

// Concept: Divides the array into two parts: a sorted part and an unsorted
// part. It repeatedly finds the minimum element from the unsorted part and puts
// it at the beginning of the sorted part.

// Stability: Unstable.

// In-Place: Yes.

// Time Complexity:

// Worst-Case: O(N^2)
// Average-Case: O(N^2)
// Best-Case: O(N^2)(always performs N^2 comparisons)

// Space Complexity: O(1) (in-place)

// When to Use: Simple to implement. Useful when memory writes are costly, as it
// performs the minimum possible number of swaps (N−1 swaps).