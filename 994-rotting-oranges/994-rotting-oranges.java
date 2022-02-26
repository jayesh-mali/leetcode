class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Node> queue = new LinkedList<>();
        int ones = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2)
                    queue.add(new Node(i, j));
                else if(grid[i][j] == 1)
                    ones++;
            }
        }
        int rowCount = grid.length-1;
        int colCount = grid[0].length-1;
        int level = -1;
        while (!queue.isEmpty()) {
            level++;
            int size = queue.size();
            while(size>0){
                Node node = queue.poll();
                int[][] dirs = {{1,0},{0,1},{-1,0},{0,-1}};
                //check in all 4 directions
                for(int[] d: dirs){
                    int x = node.row+d[0];
                    int y = node.col+d[1];
                    //if that cell is valid and has fresh orange
                    if(isValid(rowCount, colCount,x, y) && grid[x][y]==1){
                        ones--;
                        grid[x][y] = 2;
                        queue.add(new Node(x,y));
                    }
                }
                size--;
            }
        }
        if(ones != 0) return -1;
        return level == -1 ? 0 : level;
    }

    private boolean isValid(int rows, int cols, int i, int j){
        return !(i<0 || i>rows || j<0 || j>cols);
    }

    class Node {
        int row, col;
        Node(int r, int c) {
            row = r;
            col = c;
        }
    }
}