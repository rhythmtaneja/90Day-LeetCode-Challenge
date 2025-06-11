class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()){
            return false;
        }
        HashMap<Character, Integer> s1count = new HashMap<>();
        HashMap<Character, Integer> s2count = new HashMap<>();

        for (int i=0; i<s1.length(); i++){
            s1count.put(s1.charAt(i), s1count.getOrDefault(s1.charAt(i), 0) +1);
            s2count.put(s2.charAt(i), s2count.getOrDefault(s2.charAt(i), 0) +1);
        }
        
         if (s1count.equals(s2count)) {
            return true; // to check initial first window, that's why i is 0 and 1
        }

        int left = 0;
        for (int right = s1.length(); right < s2.length(); right++){
            char charRight = s2.charAt(right);
            s2count.put(charRight, s2count.getOrDefault(charRight,0)+1);

            char charLeft = s2.charAt(left);
            s2count.put(charLeft, s2count.get(charLeft)-1);
            if (s2count.get(charLeft) == 0){
                s2count.remove(charLeft);
            }
            left++;
            // left freq u=is alr completed by right freq hence for left will only remove the element and value; for eg in test case, e: 1 and i:1 when right++ then d:1 and will remove only e from left since i is alr there with freq 1;

            if (s1count.equals(s2count)){
                return true;
            }
        }
        return false;

    }
}
