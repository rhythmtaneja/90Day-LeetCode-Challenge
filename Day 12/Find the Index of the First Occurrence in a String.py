class Solution {
    public int strStr(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();

        if (n == 0) return 0;

        int i=0;
        int j=0;

        while (j<h){
            if (haystack.charAt(j) == needle.charAt(i)){
                i++;
                j++;

                 if (i == n){
            return j - n;
        }
            }
            else {
                j = j - i +1; //won't do j++ since we have to again check from j+ 1, not missing any starting point!
                i=0;
            }
        }
       
        return -1;
    }
}
