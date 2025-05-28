class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n= nums.length;
         List<List<Integer>> result = new ArrayList<>();

         for (int i=0; i<nums.length; i++){
            if (i>0 && nums[i] == nums[i-1]){
                continue; //to skip duplicates
            }
             int j = i+1;
             int k = nums.length -1;

             while (j<k) {
                int total = nums[i] + nums[j] + nums[k];

                if (total > 0) {
                    k--;
                }
                 else if (total < 0) {
                    j++;
                 } else {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++; //found 3 numbers and add to result
                    //Arrays.asList: convert set of values to list

                    while (nums[j] == nums[j-1] && j < k){
                        j++; //if prev and present j is equal then it will be of no use having the same number
                    }
                 }
             }

         }
         return result;
            }

        }
