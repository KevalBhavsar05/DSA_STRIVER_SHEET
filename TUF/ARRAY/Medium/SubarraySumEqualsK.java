import java.util.HashMap;

public class SubarraySumEqualsK {

    public static int subarraySum(int[] nums, int k) {
        // Brute Force Approach
        int n = nums.length;
        int count = 0;
        // for (int i = 0; i < n; i++) {
        // if (nums[i] == k) {
        // count++;
        // break;
        // }
        // for (int j = i + 1; j < n; j++) {
        // if ((nums[i] + nums[j]) == k) {
        // count++;
        // break;
        // }
        // }
        // }

        // Optimal Approach
        int prefixSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        // It handles subarrays that start from index 0
        // eg. nums = [3,4,7,2,-3,1,4,2,1], k = 7
        map.put(0, 1);
        for (int i = 0; i < n; i++) {
            // Calculate Prefix Sum
            prefixSum += nums[i];

            // K = prefixSum - previousPrefixSum
            int previousPrefixSum = prefixSum - k;

            // Check if previousPrefixSum exists
            if (map.containsKey(previousPrefixSum)) {
                // If exists, add its frequency to count
                count += map.get(previousPrefixSum);
            }

            // Update the frequency of prefixSum in the map
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        return count;
        // Time Complexity: O(N)
        // Space Complexity: O(N)
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 1 };
        int k = 2;
        System.out.println(subarraySum(nums, k)); // Output: 2
    }
}