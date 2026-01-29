
public class LeftRotate {
    public static void reverse(int arr[], int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public void leftRotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }

    public void rightRotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public static void main(String[] args) {
        LeftRotate lr = new LeftRotate();
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 2;

        lr.leftRotate(nums, k); // 3,4,5,6,7,1,2
        System.out.println("Array after left rotation by " + k + " positions:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        // lr.rightRotate(nums, k); // 6,7,1,2,3,4,5
        // System.out.println("Array after right rotation by " + k + " positions:");
        // for (int num : nums) {
        // System.out.print(num + " ");
        // }
        // System.out.println();
    }
}
