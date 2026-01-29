import java.util.Arrays;

public class MoveZerosToEnd {
    public static void moveZeroes(int[] nums) {
        // find index first zero element.
        int j = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }
        if (j == -1)
            return;

        for (int i = j + 1; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 0, 2, 3, 0, 4, 0, 1 };
        moveZeroes(nums);
        System.err.println(Arrays.toString(nums));
    }
}

//Time Complexity : O(n)
//Space Complexity : O(n)
