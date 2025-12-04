import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeadersInArray {
    // optimal approach
    public static int[] superiorElements(int[] nums) {
        int[] leaders = new int[nums.length];
        int k = 0;
        int max = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i > -1; i--) {
            if (nums[i] > max) {
                leaders[k] = nums[i];
                k++;
            }
            max = Math.max(max, nums[i]);
        }
        return leaders;
    }

    public static void main(String[] args) {
        int[] nums = { 16, 17, 4, 3, 5, 2 };
        System.out.println(Arrays.toString(superiorElements(nums)));
    }
}
