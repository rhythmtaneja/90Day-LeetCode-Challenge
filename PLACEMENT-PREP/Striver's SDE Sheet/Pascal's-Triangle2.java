class Solution {
    public List<Integer> getRow(int rowIndex) {
        int n = rowIndex + 1;
        long temp =1; // test case answers were exceeding int limit hence long
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        for (int i=1; i<n; i++){
            temp = temp * (n-i);
            temp = temp/i;
            ans.add((int)temp);
        }
        return ans;
    }
}
