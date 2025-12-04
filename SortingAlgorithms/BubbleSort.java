//In first iteration largest element is placed to its position
package SortingAlgorithms;

import java.util.*;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int temp;
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
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
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

// Concept: Repeatedly steps through the list, compares adjacent elements and
// swaps them if they are in the wrong order. Passes through the list are
// repeated until no swaps are needed, indicating the list is sorted.
// Analogy: Lighter bubbles "bubble up" to the top (or heavier elements sink to
// the bottom).

// Stability: Stable.
// In-Place: Yes

// Time Complexity:
// Worst-Case: O(N^2)
// Average-Case: O(N^2)
// Best-Case: O(N) (already sorted array, due to optimization)
// Space Complexity: O(1) (in-place)