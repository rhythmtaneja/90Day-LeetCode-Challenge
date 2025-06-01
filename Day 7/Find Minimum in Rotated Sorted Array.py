class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length -1;
        if (nums[left] <= nums[right]) return nums[left];
        //if array is alr sorted then return nums[left] that is 1st number
        
        while (left < right){
            int mid = (left + right)/2;
            if (mid < nums.length - 1 && nums[mid + 1]  < nums[mid]){
                return nums[mid + 1];
                // mid < nums.length - 1 to handle if there is no mid
            }
            else if (mid > 0 && nums[mid - 1]  > nums[mid]){
                return nums[mid];
            }
            else if (nums[mid] > nums[right]){
                left = mid + 1;
            }
            else right = mid -1;
        }
        return -1;
    }
}
