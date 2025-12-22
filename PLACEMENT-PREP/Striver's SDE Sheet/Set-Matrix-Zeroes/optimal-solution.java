class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int col0 = 1;
    // new array of row and col was used in prev sol.
    //    int[] row = new int[n]; --> matrix [0][...] (optimal approach)
    //    int[] col = new int[m]; --> matrix [...][0]

       // marking of col and rows
        for (int i =0; i<n; i++){
            for (int j = 0; j<m; j++){
                if (matrix[i][j] == 0){
                    // mark the i-th row
                    matrix[i][0] = 0;

                    //mark the j-th col
                    if (j != 0){
                        matrix[0][j] = 0;
                    }
                    else {
                        col0 = 0;
                    }
                }
            }
        }
        // iterate w/o 0th row and 0th col (inner box)
        for (int i =1; i<n; i++){
            for (int j = 1; j<m; j++){
                if(matrix[i][j] != 0){
                    //check for col & row
                    if (matrix [0][j] == 0 || matrix [i][0] == 0){
                        matrix[i][j] = 0;
                    }
                }
            }
        } 
        if (matrix[0][0] == 0){
            for (int j=0; j<m; j++){
                matrix[0][j] = 0;
            }
        }
        if (col0 == 0){
            for (int i = 0; i<n; i++){
                matrix[i][0] = 0;
            }
        }
    }
}
