class Solution {
    //https://www.youtube.com/watch?v=-YVsiCrbeRE
    public int largestSubmatrix(int[][] matrix) {
        for(int i=1; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j]==1){
                    matrix[i][j] = matrix[i-1][j]+1;
                }
            }
        }
        int max = 0;
        for(int i=0; i<matrix.length; i++){
            int arr[] = Arrays.stream(matrix[i]).boxed().sorted(Collections.reverseOrder()).mapToInt(a->a).toArray();
            for(int j=0; j<arr.length; j++){
                if(arr[j]<1)
                    break;
                max = Math.max(max, arr[j]*(j+1));
            }
        }
        return max;
    }
}