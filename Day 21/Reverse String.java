class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        char temp;

        while (left <= right){
            temp = s[right];
            s[right] = s[left];
            s[left] = temp;
            left++;
            right--;
        }
    }
}
