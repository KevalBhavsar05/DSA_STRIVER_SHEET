public class LongestSubarrayWithK {
    public static int findLongestSubarrayWithKDistinct(int[] arr, int k) {
        int left = 0, right = 0;
        int sum = 0;
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int maxLen = 0;
        while (right < n) {
            sum += arr[right];
            if (sum < 0) {
                sum = 0;
                left++;
            }

            // Shrink window
            while (sum > k) {
                sum -= arr[left];
                left++;
            }

            // Update maxLen
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
                maxSum = Math.max(sum, maxSum);
            }

            // Expand window
            right++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = { -1, 1, 1 };
        int k = 1;
        int maxLength = findLongestSubarrayWithKDistinct(arr, k);
        System.out.println("Length of longest subarray with at most " + k + " distinct integers: " + maxLength);
    }
}

// Time Complexity: O(N), where N is the size of the array. The algorithm
// traverses the array once with two pointers, making it linear in time
// complexity.

// Space Complexity: O(1), as it uses a constant amount of space.