class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum= Integer.MIN_VALUE;
        int n = nums.length;
        for (int i = 0; i< n; i++){
            sum += nums[i]; // everytime getting a number, adding to the sum

            if (sum > maxSum){
                maxSum = sum;
            }


            if (sum < 0){
                sum = 0; // anytime getting less than 0; do not carry any -ves
            }

            if (n == 0)
            return 0;

        if (n == 1)
            return nums[0];
        }
        return maxSum;
    }
}
