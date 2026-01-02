class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int mini = n/3 + 1; // elem should greater than floor of n/3

        for (int i = 0; i<n; i++){
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);

                // add to result only when count reaches to mini
                if (mpp.get(nums[i]) == mini){
                    result.add(nums[i]);
                }
                if (result.size() == 2) break;
        }
        return result;
    }
}
