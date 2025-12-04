
public class isArraySorted {
    public static void main(String[] args) {
        int[] arr = { 1, 6, 3, 4, 5, 6, 7, 8, 9 };
        Boolean swapped = false;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            if (arr[i] > arr[i + 1]) {
                swapped = true;
                break;
            }
        }
        if (swapped) {
            System.out.println("Array is not sorted");
        } else {
            System.out.println("Array is sorted");
        }
    }
}