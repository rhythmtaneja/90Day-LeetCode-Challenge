class Solution {
    public int longestConsecutive(int[] nums) {
          if (nums.length == 0) return 0;
        Arrays.sort(nums);
        int longest = 1;
        int current =1;
        for (int i=1; i<nums.length; i++){
            if (nums[i] == nums[i-1]){
                continue;
            }
            else if (nums[i] == nums[i-1] + 1 ) {
                current++; // 3 = 2+1 to check consecutive
            }
            else {
                longest = Math.max(longest,current);
                current = 1; //reset the streak
            }
            

        }
        return Math.max(longest, current); // in case longest is at the end
    }
}
