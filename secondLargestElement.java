public class secondLargestElement {
    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 2, 1, 4, 6, 6, 9, 9 };
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        // for (int i = 1; i < arr.length; i++) {
        // if (arr[i] > largest) {
        // largest = arr[i];
        // }
        // }

        // for (int i = 1; i < arr.length; i++) {
        // if (arr[i] > secondLargest && arr[i] != largest) {
        // secondLargest = arr[i];
        // }
        // }

        // Optimal Solution
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.err.println("First Largest is : " + largest);
        System.err.println("Second Largest is : " + secondLargest);
    }
}
