class Solution {
    public int jump(int[] nums) {
        int max = 0;
        int ans = 0;
        int range_end = 0;

        for (int i=0; i<nums.length-1; i++){
            max = Math.max(max, i+nums[i]);
            if (i == range_end){
                ans++;
                range_end = max;
            }
        }
        return ans;
    }
}
