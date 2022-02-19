class Solution {
    public void rotate(int[][] matrix) {
        if(matrix.length != matrix[0].length) throw new IllegalArgumentException("Invalid input");
        transpose(matrix);
        reflect(matrix);
    }
    
    private void transpose(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=i+1; j<matrix[0].length; j++){
                swap(matrix, i, j);
            }
        }
    }
    
    private void reflect(int[][] matrix){
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
}