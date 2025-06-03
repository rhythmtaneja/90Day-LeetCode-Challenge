class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> mpp= new HashMap<>();
        int res=0; //to store the char
        int majority = 0; //to store the freq

        for (int n:nums){
            mpp.put(n, 1+ mpp.getOrDefault(n,0));
            /* int a = mpp.get(n);
            a = Math.max(a,majority);
            res = n; */
            if (mpp.get(n) > majority){
                 res = n;
                 majority = mpp.get(n); 
            }
        }
        return res;
    }
}
