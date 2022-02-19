class Solution {
    public void rotate(int[][] matrix) {
        if(matrix.length != matrix[0].length) throw new IllegalArgumentException("Invalid input");
        transpose(matrix);
        reverseRows(matrix);
    }
    
    private void transpose(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=i+1; j<matrix[0].length; j++){
                swap(matrix, i, j);
            }
        }
    }
    
    private void reverseRows(int[][] matrix){
        int n = matrix.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
    }
    
    private void swap(int[][] matrix, int i, int j){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
    
    /*
    i=1
    [r1][c1] <=> [r2][c2]
    [0][1] <=> [1][0]
    [1][0] <=> [0][1] same as prev
    
    i=2
    [0][2] <=> [2][0]
    [1][1] <=> [1][1] not require
    
    i=3
    [0][3] <=> [3][0]
    [1][2] <=> [2][1]
    [2][1] <=> [1][2] same as prev
    
    i=4
    [1][3] <=> [3][1]
    [2][2] <=> [2][2] same as prev
    */
}