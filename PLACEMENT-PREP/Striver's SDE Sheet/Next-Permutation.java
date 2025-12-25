class Solution {
    public void nextPermutation(int[] nums) {
        // making longest prefix
        int idx = -1;
        for (int i = nums.length - 2; i >= 0; i--){
            if (nums[i] < nums[i+1]){
                idx = i;
                break;
            }
        }
        // edge case, if no dip
        if (idx == -1){
            reverse(nums, 0, nums.length-1);
            return;
        }
        // finding just larger element
        for (int i = nums.length -1; i>idx; i--){
            if (nums[i] > nums[idx]){
                swap(nums, i , idx);
                break;
            }
        }
        // reverse part after swapping idx
        reverse(nums, idx +1, nums.length-1);
        return;
    }

    //reverse array function
    private void reverse(int [] arr, int start, int end){
        while (start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    // swap function
    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
