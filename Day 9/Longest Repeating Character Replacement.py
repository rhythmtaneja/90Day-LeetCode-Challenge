class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> mpp= new HashMap<>();
        int maxLength = 0, i = 0, maxFreq = 0;
        for (int j =0; j<s.length(); j++){
             char c = s.charAt(j);
             mpp.put(c, mpp.getOrDefault(c,0) + 1); 
             //get the value of c if it exists, if not then 0; also we have +1 that means first pair will be, (c,1)
             maxFreq = Math.max(maxFreq, mpp.get(c));

             while ((j - i + 1) - maxFreq > k){
                // length - maxFreq should be less than or equal to k;
                char left = s.charAt(i);
                mpp.put(left, mpp.get(left) - 1);
                // (A,(3-1)) coz left++
                i++;
            }
             maxLength = Math.max(maxLength, j-i+1);
        }
        return maxLength;
    }
}
