class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+"); //all extra things cleared and returns in array
        StringBuilder res = new StringBuilder();
        for (int i = words.length - 1; i>=0; i--){
            res.append(words[i]);
            if(i != 0){
                res.append(" ");
            }
        }

        return res.toString().trim(); //remove spaces from start and end
    }
}
