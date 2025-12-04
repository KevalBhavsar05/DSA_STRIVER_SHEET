

public class MoveZerosToEnd {
    public void moveZeroes(int[] nums) {
        // find index first zero element.
        int j = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        // do nothing if there is no zero.
        if (j == -1) {
            return;
        }

        // start with j+1 index to replace non-zero with zeros.
        for (int i = j + 1; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }

}
