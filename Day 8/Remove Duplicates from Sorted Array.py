class Solution {
    public int removeDuplicates(int[] nums) {
      int i=1;
      int j=1;
      while ( j<nums.length){
        if (nums[j] != nums[i-1]){
            nums[i]= nums[j];
            i++ ;
        }
        else {
            j++;
        }
      }
      
      return i;
    }
}
