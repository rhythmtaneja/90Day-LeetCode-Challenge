class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> mpp = new HashMap<>();
        for (int i=0; i<s.length(); i++){
        mpp.put(s.charAt(i), mpp.getOrDefault(s.charAt(i), 0) +1);
        }
        int sum=0;
        for (int value: mpp.values()){
            if (value % 2 ==0){
                sum += value;
            }
            else {
            sum += value - 1;
            }

        }
        if (sum<s.length()){
            return sum + 1;
        }
        else return sum;
    }
}
