class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int left = 0;
       int right = 0;
       int size = Integer.MAX_VALUE;
       int sum = 0;

       while (right<nums.length){
        sum+= nums[right];
        while (sum >= target){
            size = Math.min(size, right - left + 1);
            sum -= nums[left];
            left++;
        }
            right++;
       }
       return size == Integer.MAX_VALUE ? 0: size;
    }
}
