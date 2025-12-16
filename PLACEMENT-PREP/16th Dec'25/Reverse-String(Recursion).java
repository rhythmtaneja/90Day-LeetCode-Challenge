class Solution {
    public void reverseString(char[] s) {
        swap(s, 0, s.length-1);
    }
    private void swap(char[] s, int left, int right){
        if (left >= right){
            return;
        }
         char temp = s[right];
         s[right] = s[left];
         s[left] = temp;
         
         swap(s,left+1, right-1);
    }
}
