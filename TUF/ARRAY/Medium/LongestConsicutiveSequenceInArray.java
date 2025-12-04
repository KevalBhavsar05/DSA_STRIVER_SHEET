

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class LongestConsicutiveSequenceInArray {
    // 1st approach is to sort array and find max length of sequence -> O(nlogn + n)
    // 2nd is to use Set -> O(n)
    
    // My 1st solution
    // public static int longestConsecutive(int[] nums) {
    // if (nums.length == 0)
    // return 0;

    // Map<Integer, Integer> map = new TreeMap<>();

    // for (int i = 0; i < nums.length; i++) {
    // map.put(nums[i], 1);
    // }

    // int prev = Integer.MIN_VALUE;
    // int count = 0, maxCount = 0;
    // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    // int key = entry.getKey();
    // if (key == prev + 1) {
    // count++;
    // } else {
    // count = 1;
    // }
    // maxCount = Math.max(count, maxCount);
    // prev = key;
    // }
    // return maxCount;
    // }

    // 2nd approach
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int maxLength = 0;
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                    set.remove(currentNum);
                }
                maxLength = Math.max(maxLength, currentLength);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = { 0, -1 };
        System.out.println(longestConsecutive(arr));
    }
}
