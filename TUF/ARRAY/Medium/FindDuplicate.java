import java.util.HashMap;
import java.util.Map;

public class FindDuplicate {
    public static int findDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) != null)
                return nums[i];
            map.put(nums[i], 1);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 1, 3, 4, 2 };
        System.out.println(findDuplicate(nums));
    }

}
