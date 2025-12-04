

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorElement {
    public static int findMajorElement1(int[] nums) {
        // approach-1
        // Arrays.sort(nums); // It’s an optimized version of Quicksort that uses two
        // pivots instead of one.
        // return nums[nums.length / 2];
        // Time Complexity : O(nlogn) & Space Complexity : O(1)

        // approach-2
        // Map<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < nums.length; i++) {
        // if (map.containsKey(nums[i])) {
        // map.put(nums[i], map.get(nums[i]) + 1);
        // } else {
        // map.put(nums[i], 1);
        // }
        // }
        // int majorElement = nums[0];
        // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        // if (entry.getValue() > nums.length / 2) {
        // majorElement = entry.getKey();
        // break;
        // }
        // }
        // // Time Complexity : O(n) & Space Complexity : O(n)
        // return majorElement;

        // Optimal Solution (Moore's Voting Algorithm)
        int ele = nums[0];
        int cnt1 = 1;
        for (int i = 1; i < nums.length; i++) {
            if (cnt1 == 0) {
                ele = nums[i];
                cnt1 = 1;
            } else if (nums[i] == ele)
                cnt1++;
            else
                cnt1--;
        }
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == ele)
                cnt++;
        }
        if (cnt > nums.length / 2)
            return ele;
        return -1;
        // Time Complexity : O(n) & Space Complexity : O(1)
    }

    public static List<Integer> findMajorElement2(int[] nums) {
        // bruteforce approach
        List<Integer> list = new ArrayList<>();
        // for (int i = 0; i < nums.length; i++) {
        // int count = 0;
        // for (int j = 0; j < nums.length; j++) {
        // if(nums[i] == nums[j])
        // ++count;
        // if(count > Math.floor(nums.length / 3) && !list.contains(nums[i])){
        // list.add(nums[i]);
        // break;
        // }
        // }
        // }
        // Time Complexity : O(N^2) Space Complexity : O(1)

        // better solution
        // Map<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < nums.length; i++) {
        // if (map.containsKey(nums[i]))
        // map.put(nums[i], map.get(nums[i]) + 1);
        // else
        // map.put(nums[i], 1);
        // }

        // for (int i = 0; i < nums.length; i++) {
        // if (map.get(nums[i]) > nums.length / 3 && !list.contains(nums[i]))
        // list.add((nums[i]));
        // }
        // Time Complexity : O(N) Space Complexity : O(N)

        // Optimal Solution(Used Moore's Voting algorithm)
        int ele1 = nums[0];
        int ele2 = nums[1];
        int cnt1 = 1;
        int cnt2 = 1;
        for (int i = 0; i < nums.length; i++) {
            if (cnt1 == 0 && nums[i] != ele2) {
                cnt1 = 1;
                ele1 = nums[i];
            } else if (cnt2 == 0 && nums[i] != ele1) {
                cnt2 = 1;
                ele2 = nums[i];
            } else if (nums[i] == ele1)
                cnt1++;
            else if (nums[i] == ele2)
                cnt2++;
            else {
                cnt1--;
                cnt2--;
            }
        }

        // verify
        cnt1 = 0;
        cnt2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == ele1)
                cnt1++;
            else if (nums[i] == ele2)
                cnt2++;
        }

        System.out.println(ele1 + " " + ele2);
        if (cnt1 > nums.length / 3)
            list.add(ele1);
        else if (cnt2 > nums.length / 3)
            list.add(ele2);

        return list;
    }

    public static void main(String args[]) {
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(findMajorElement1(nums));
        findMajorElement2(nums);
    }
}
