//Used two pointers approach to solve the problem
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int start = -1;
        int finalStart = -1;
        int finalEnd = -1;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (sum == 0)
                start = i;
            sum += nums[i];
            if (sum > maxSum) {
                maxSum = sum;
                finalStart = start;
                finalEnd = i;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        for (int i = finalStart; i <= finalEnd; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        return maxSum;
    }

    public static void main(String[] args) {
        MaximumSubarray ms = new MaximumSubarray();
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int result = ms.maxSubArray(nums);
        System.out.println("The maximum subarray sum is: " + result);
    }
}
