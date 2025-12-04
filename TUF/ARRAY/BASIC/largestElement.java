public class largestElement {
    public static int largestElementInArray(int nums[]) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max)
                max = nums[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 4, 2, 5, 7, 1, 2, 56, 98 };
        System.out.println("Max element is " + largestElementInArray(nums));
    }
}
