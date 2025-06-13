class Solution {
    public void moveZeroes(int[] nums) {
        // better approach is there!
        int left = 0;
        int right = 0;
        int temp = 0; 
        while (left <= right && right< nums.length){
            if (nums[left] == 0 && nums[right] == 0){
                right++;
            }
            else if (nums[left] != 0 && nums[right] == 0){
                left = right;
                right++;
            }
            else if (nums[left] == 0 && nums[right] != 0){
                temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                right++;
                left++;
            }
            else {
                right++;
                left++;
            }
        }
    }
}
