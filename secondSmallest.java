public class secondSmallest {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 1, 4, 6, 6, 9, 9 };
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;

        // Better Solution f(n) = 2n ==> O(n)
        // for (int i = 1; i < arr.length; i++) {
        // if (arr[i] < smallest) {
        // smallest = arr[i];
        // }
        // }

        // for (int i = 1; i < arr.length; i++) {
        // if (arr[i] < secondSmallest && arr[i] != smallest) {
        // secondSmallest = arr[i];
        // }
        // }

        // Optimal Solution f(n) = n ==> O(n)
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            }
            if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }

        System.err.println("Smallest is : " + smallest);
        System.err.println("Second Smallest is : " + secondSmallest);
    }
}
