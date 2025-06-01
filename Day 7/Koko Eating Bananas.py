class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int low = 1;
       int high = 0;

       for (int pile : piles){
        high = Math.max(high, pile);
       }
       int result = high;
       while (low <=high){
        int mid = low + (high - low) / 2; // To avoid overflows
        long hours = 0; //total hrs needed at mid speed

        for (int pile:piles){
            hours += (pile + mid-1) / mid; //round up to next integer, same as Math.ceil((double)pile/mid)
        }

        if (hours <= h){
            result = mid;
            high= mid -1;
        } else {
            low = mid +1;
        }
       }
       return result;
    }
}
