

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        // Optimal Approach
        // Time Complexity : O(n)
        // Space Complexity : O(1)
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }
    public static void main(String[] args) {
        SingleNumber sn = new SingleNumber();
        int[] nums = { 4, 1, 2, 1, 2 };
        System.out.println(sn.singleNumber(nums)); // Output: 4
    }
}
        // Better Apporoach
        // Time Complexity : O(n)
        // Space Complexity : O(n)
        // public int singleNumber(int[] nums) {
        // Map<Integer, Integer> countMap = new HashMap<>();
        // for (int i = 0; i < nums.length; i++) {
        // if (countMap.containsKey(nums[i])) {
        // countMap.put(nums[i], countMap.get(nums[i]) + 1);
        // } else {
        // countMap.put(nums[i], 1);
        // }
        // }
        // int element = -1;
        // for (int key : countMap.keySet()) {
        // if (countMap.get(key) == 1) {
        // element = key;
        // break;
        // }
        // }
        // return element;
        // }