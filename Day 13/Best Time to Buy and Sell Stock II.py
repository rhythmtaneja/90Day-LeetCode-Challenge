class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        for (int i = 1; i< prices.length; i++){
            int sum = 0;
            if (prices[i] > prices[i-1]){
                sum = prices[i] - prices[i-1];
                result+=sum;
            }
        }
        return result;
    }
}
