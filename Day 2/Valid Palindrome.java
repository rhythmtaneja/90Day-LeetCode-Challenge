class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
       int left = 0;
       int right = s.length() -1;
       while (left < right) {
        // ignoring non-alphanumeric characters
        while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
        left++ ;
       }
       while (left < right && !Character.isLetterOrDigit(s.charAt(right))){
       right-- ;
    }

    if (s.charAt(left) != s.charAt(right)) {
        return false;
    }
    left++ ;
    right-- ;
       }
       return true;
    }
}
