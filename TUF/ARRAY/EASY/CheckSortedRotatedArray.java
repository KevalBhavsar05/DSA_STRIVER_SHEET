public class CheckSortedRotatedArray {
    // So, here we will count the number of times the next element is smaller than
    // the current element.
    // nums[i] > nums[(i + 1) % nums.length] is comparing ith with the ith + 1
    // element
    // so when we reach i => n than last element will be compared with 0th element

    // So, we have to check that a[i] < a[i+1] and last element should be less than
    // first element for sorted rotated array.
    // So, number of times a[i] > a[i+1] should be only one.
    
    public boolean check(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[(i + 1) % nums.length]) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }
        return true;
    }
}
