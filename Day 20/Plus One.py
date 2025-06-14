class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
       for (int i = n-1; i>=0; i--) {
        if (digits[i] + 1 != 10){
            digits[i] +=1;
            return digits;
        }
        digits[i] = 0;
        //if 9 hai last me and sum is 10; then current index to 0 ban jayega and first index 1;
       }
       int []newDigits = new int [n+1];
       newDigits[0] = 1;
       return newDigits; 
    }
}
