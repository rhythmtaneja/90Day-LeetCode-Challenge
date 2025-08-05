class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap< Character, Integer > mpp = new HashMap<>();
        for (char c: s.toCharArray() ) {
            mpp.put(c, mpp.getOrDefault(c,0) +1 );
        }
        HashMap< Character, Integer > mpb = new HashMap<>();

         for (char d: t.toCharArray() ) {
            mpb.put(d, mpb.getOrDefault(d,0) +1 ); 
        }
        if (mpp.equals(mpb)) {
            return true ;
        }
        else {
            return false ;
        }
    }
}
