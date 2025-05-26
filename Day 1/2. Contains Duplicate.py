class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i=0 ; i < nums.length ; i++){
        int a = nums[i];
        if (mpp.containsKey(a)){
            return true ;
        }
        mpp.put(a,i);
        }
        return false ;
    }
}
