package TUF.ARRAY.LeetCode;

import java.util.Arrays;

public class Problem_4 {
    // Function to find the median of two sorted arrays
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int left = 0, right = 0;
        int m = nums1.length, n = nums2.length;
        int[] temp = new int[m + n];
        int k = 0;

        while (left < m && right < n) {
            if (nums1[left] <= nums2[right]) {
                temp[k] = nums1[left];
                left++;
                k++;
            } else {
                temp[k] = nums2[right];
                right++;
                k++;
            }
        }

        while (left < m) {
            temp[k] = nums1[left];
            left++;
            k++;
        }

        while (right < n) {
            temp[k] = nums2[right];
            right++;
            k++;
        }

        System.out.println("Merged array: " + Arrays.toString(temp));

        double med;
        if ((m + n) % 2 == 1) {
            med = temp[temp.length / 2];
            return med;
        }
        med = (temp[temp.length / 2] + temp[temp.length / 2 - 1]) / 2.0; // n/2 th and (n/2 -1)th here n/2-1 is because of 0 based indexing
        return med;

    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2 };
        int[] nums2 = { 3, 4 };
        Problem_4 solution = new Problem_4();
        double median = solution.findMedianSortedArrays(nums1, nums2);
        System.out.println("Median of the two sorted arrays is: " + median);
    }
}
