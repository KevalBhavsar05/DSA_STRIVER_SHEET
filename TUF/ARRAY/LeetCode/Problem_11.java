package TUF.ARRAY.LeetCode;

public class Problem_11 {
    public int maxArea(int[] height) {
        // bruteforce
        // int area = 0;
        // int maxArea = Integer.MIN_VALUE;
        // for(int i = 0; i < height.length - 1 ; i++){
        // area = 0;
        // for(int j = i+1; j < height.length ; j++){
        // if(height[j] <= height[i]){
        // area = height[j] * (j - i);
        // }
        // }
        // maxArea = Math.max(area, maxArea);
        // }
        // Time Complexity: O(N^2) where N is the number of elements in height array
        // Space Complexity: O(1) as no extra space is used

        // optimal
        int area = 0;
        int maxArea = Integer.MIN_VALUE;
        int l = 0;
        int r = height.length - 1;
        while (l < r) {
            if (height[l] <= height[r]) {
                area = height[l] * (r - l);
                l++;
            } else if (height[l] > height[r]) {
                area = height[r] * (r - l);
                r--;
            }
            if (area > maxArea) {
                maxArea = area;
            }
        }
        return maxArea;
        // Time Complexity: O(N) where N is the number of elements in height array
        // Space Complexity: O(1) as no extra space is used
    }

    public static void main(String[] args) {
        Problem_11 p11 = new Problem_11();
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int result = p11.maxArea(height);
        System.out.println("The maximum area of water that can be contained is: " + result);
    }
}