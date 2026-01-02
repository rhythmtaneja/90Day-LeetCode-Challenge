class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // similar to majority elememt 1, only 2 counters are considered
        
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        int cnt1 = 0, cnt2 = 0;
        int el1 = 0, el2 = 0;

        for (int i =0; i<n; i++){
            if (cnt1 == 0 && el2 != nums[i]){ // if el1 is same as el2 then we can't count from start, hence el2 != nums[i] is an edge case
                cnt1 = 1;
                el1 = nums[i];
            }
            else if (cnt2 == 0 && el1 != nums[i]){
                cnt2 = 1;
                el2 = nums[i];
            }
            else if (nums[i] == el1){
                cnt1++;
            }
            else if (nums[i] == el2){
                cnt2++;
            }
            else{
                cnt1-- ; cnt2-- ;
            }
        }

        //to verify if el1 el2 greater than n/3 times
        cnt1 = 0; cnt2 = 0; 
        for (int i = 0; i < n; i++) {
            if (nums[i] == el1) cnt1++; 
            if (nums[i] == el2) cnt2++;
        }
        int mini = n / 3 + 1;
        if (cnt1 >= mini) result.add(el1);
        if (cnt2 >= mini && el1 != el2) result.add(el2);

        return result;
    }
}
