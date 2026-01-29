public class NextPermutation {
    // Reverses the array from index s to e (inclusive)
    public static void reverse(int[] nums, int s, int e) {
        while (s < e) {
            int t = nums[s];
            nums[s] = nums[e];
            nums[e] = t;
            s++;
            e--;
        }
    }

    // Swaps elements at index s and e
    public static void swap(int[] nums, int s, int e) {
        int t = nums[s];
        nums[s] = nums[e];
        nums[e] = t;
    }

    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;

        // Find the break point index:
        // the rightmost index i such that nums[i] < nums[i + 1]
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }

        // If no break point is found,
        // it means the array is the last permutation
        if (index == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // Swap the value at break point index
        // with the smallest element greater than it on the right side
        for (int i = n - 1; i > index; i--) {
            if (nums[i] > nums[index]) {
                swap(nums, index, i);
                break;
            }
        }

        // Reverse the elements after the break point
        // to get the next lexicographically smallest permutation
        reverse(nums, index + 1, n - 1);
    }

}
