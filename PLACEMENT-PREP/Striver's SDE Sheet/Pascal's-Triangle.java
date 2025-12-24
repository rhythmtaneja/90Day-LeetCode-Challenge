class Solution {
    private List<Integer> generateRow(int row) { // Pascal Triangle 2 solution
        long temp = 1; // answer can be vlarge (hence no int)
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);
        for (int col = 1; col < row; col++) {
            temp = temp * (row - col);
            temp = temp / col;
            ansRow.add((int) temp);
        }
        return ansRow;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i =1; i<=numRows; i++){
            ans.add(generateRow(i));
        }
        return ans;
    }
}
