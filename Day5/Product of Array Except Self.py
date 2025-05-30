class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] ans = new int[n];
        ans[0] = 1;
        // left array
        for (int i=1; i<n; i++){
            ans [i] = ans[i-1] * nums[i-1];
        }
        int rightpdt = 1;
        for(int i=n-1; i>=0; i--){
            ans [i] = ans [i] * rightpdt;
            rightpdt *= nums[i];
        }
        return ans;

    }
}
