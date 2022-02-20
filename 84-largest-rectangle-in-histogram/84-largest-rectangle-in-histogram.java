class Solution {
    public int largestRectangleArea(int[] heights) {
        if(heights.length == 1) return heights[0];

        int[] left = leftHeight(heights);
        int[] right = rightHeight(heights);
        
        int maxArea = 0;
        for(int i=0; i<heights.length; i++){
            int width = right[i] - left[i] + 1;
            maxArea = Math.max(width*heights[i], maxArea);
        }
        return maxArea;
    }
    
    private int[] leftHeight(int[] heights){
        int[] limit = new int[heights.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<heights.length; i++){
            if(stack.isEmpty()){
                limit[i] = 0;
            }else{
                while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                    stack.pop();
                }
                limit[i] = stack.isEmpty() ? 0 : stack.peek()+1;
            }
            stack.push(i);
        }
        return limit;
    }
    
    private int[] rightHeight(int[] heights){
        int[] limit = new int[heights.length];
        Stack<Integer> stack = new Stack<>();
        int len = heights.length-1;
        for(int i=heights.length-1; i>=0; i--){
            if(stack.isEmpty()){
                limit[i] = len;
            }else{
                while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                    stack.pop();
                }
                limit[i] = stack.isEmpty() ? len : stack.peek()-1;
            }
            stack.push(i);
        }
        return limit;
    }
}
/*
max = -inf, 2
[2]
input=> 2, 1
max(1,min(1,2)*2)


[1,5,6]
input => 2
max(2,6,min(2,6)*2)
max = max(min(2,6)*2, 6)
max = max(min(curr,top)*3,)
while(stack.notempty() && top > current){
    stack.pop
    
}

*/