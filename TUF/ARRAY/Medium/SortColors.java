

public class SortColors {
    public static void sortColors(int[] nums) {
        // Approach - 1
        int zero = 0;
        int one = 0;
        int two = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                zero++;
            else if (nums[i] == 1)
                one++;
            else
                two++;
        }
        for (int i = 0; i < zero; i++) {
            nums[i] = 0;
        }
        for (int i = zero; i < zero + one; i++) {
            nums[i] = 1;
        }
        for (int i = zero + one; i < nums.length; i++) {
            nums[i] = 2;
        }
        // Time Complexity : O(n) & Space Complexity : O(1)
    }

    public static void main(String args[]) {
        int[] nums = { 2, 0, 2, 1, 1, 0 };
        sortColors(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
