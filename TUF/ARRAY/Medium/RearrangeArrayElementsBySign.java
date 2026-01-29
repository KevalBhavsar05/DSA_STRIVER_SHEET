public class RearrangeArrayElementsBySign {

    public int[] rearrangeArray(int[] nums) {
        // bruteforce approach
        // int[] positive = new int[nums.length / 2];
        // int[] negative = new int[nums.length / 2];
        // int p = 0 , n = 0;
        // for(int i = 0 ; i < nums.length ; i++){
        // if(nums[i] < 0){
        // negative[n]=nums[i];
        // n++;
        // }else{
        // positive[p] = nums[i];
        // p++;
        // }
        // }
        // p=0;
        // n=0;
        // for(int i = 0 ; i < nums.length ; i++){
        // if(i % 2 == 0){
        // nums[i] = positive[p];
        // p++;
        // }else{
        // nums[i] = negative[n];
        // n++;
        // }
        // }
        // return nums;
        // TC = O(N) , SC = O(N)

        // Better Approach
        int[] result = new int[nums.length];
        int pos = 0;
        int neg = 1;
        for (int val : nums) {
            if (val < 0) {
                result[neg] = val;
                neg += 2;
            } else {
                result[pos] = val;
                pos += 2;
            }
        }
        return result;
        // TC = O(N) , SC = O(N)
    }

}