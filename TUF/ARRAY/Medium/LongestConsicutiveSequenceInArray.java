import java.util.HashSet;
import java.util.Set;

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

    // public static int longestConsecutive(int[] nums) {
    // if (nums.length == 0)
    // return 0;

    // int maxLength = 1;
    // int lastSmall = Integer.MIN_VALUE;
    // int count = 0;
    // Arrays.sort(nums);
    // for (int i = 0; i < nums.length; i++) {
    // if (nums[i] - 1 == lastSmall) {
    // count++;
    // lastSmall = nums[i];
    // } else if (nums[i] != lastSmall) {
    // count = 1;
    // lastSmall = nums[i];
    // }
    // maxLength = Math.max(count, maxLength);
    // }
    // return maxLength;
    // }

    // Optimal approach
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        int maxLength = 1;
        Set<Integer> set = new HashSet<>();
        // add all elements into set(all unique elements)
        for (int x : nums) {
            set.add(x);
        }
        // iterate through set

        for (int el : set) {
            // if nums[i]-1 OR el-1 it is the starting point of sequence
            if (!set.contains(el - 1)) {
                int count = 1;
                int x = el;
                while (set.contains(x + 1)) {
                    x++;
                    count++;
                }
                maxLength = Math.max(count, maxLength);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = { 0, -1 };
        System.out.println(longestConsecutive(arr));
    }
}
