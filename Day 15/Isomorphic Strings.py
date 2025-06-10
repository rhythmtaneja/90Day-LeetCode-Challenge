class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> mpp = new HashMap<>();
        if (s.length() != t.length()){
            return false;
        }
        for (int i = 0; i < s.length(); i++){
            char sc = s.charAt(i);
            char tc = t.charAt(i);

            if(mpp.containsKey(sc)){
                if (mpp.get(sc) != tc){
                    return false;
                }
            } else if (mpp.containsValue(tc)){
                return false;
            }
             mpp.put(sc, tc);
        }
        return true;

    }
}
