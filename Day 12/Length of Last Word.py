class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        int j = words.length-1;
        while (j >= 0){
            if (words[j] == " "){
                j-- ;
            }
            else return words[j].length();
        }
        return 0;
    }
}
