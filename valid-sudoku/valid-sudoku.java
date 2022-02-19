class Solution {
    public boolean isValidSudoku(char[][] board) {
        int size = board.length;
        for(int i=0; i<size; i++){
            if(!isRowValid(board, i))
                return false;
            if(!isColumnValid(board, i))
                return false;  
        }
        for(int i=0; i<size/3; i++){
            for(int j=0; j<size/3; j++){
               if(!isGridValid(board, i*3, j*3)) 
                   return false;
            }
        }
        return true;
    }
    
    private boolean isRowValid(char[][] board, int row){
        int[] freq = new int[board[row].length];
        for(int i=0; i<board[row].length; i++){
            if(board[row][i]!='.'){
                int value = getValue(board[row][i]);
                if(freq[value] > 0){
                    return false;
                }
                freq[value]++;
            }
        }
        return true;
    }
    
    private boolean isColumnValid(char[][] board, int col){
        int[] freq = new int[board.length];
        for(int i=0; i<board.length; i++){
            if(board[i][col]!='.'){
                int value = getValue(board[i][col]);
                if(freq[value] > 0){
                    return false;
                }
                freq[value]++;
            }
        }
        return true;
    }
    
    private boolean isGridValid(char[][] board, int row, int col){
        int[] freq = new int[board.length];
        for(int i=row; i<row+3; i++){
            for(int j=col; j<col+3; j++){
                if(board[i][j]!='.'){
                    int value = getValue(board[i][j]);
                    if(freq[value] > 0){
                        return false;
                    }
                    freq[value]++;
                }
            }
        }
        return true;
    }
    
    private int getValue(char ch){
        return Character.getNumericValue(ch)-1;
    }
}