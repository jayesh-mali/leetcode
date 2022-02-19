class Solution {
    public int trap(int[] height) {
        if(height.length <= 2)
            return 0;
        int[] leftHeight = new int[height.length];
        int[] rightHeight = new int[height.length];
        leftHeight[0] = height[0];
        for(int i=1; i<height.length; i++){
            leftHeight[i] = Math.max(leftHeight[i-1], height[i]);
        }
        rightHeight[height.length-1] = height[height.length-1];
        for(int i=height.length-2; i>=0; i--){
            rightHeight[i] = Math.max(rightHeight[i+1], height[i]);
        }
        int count = 0;
        for(int i=0; i<height.length; i++){
            count += Math.min(leftHeight[i], rightHeight[i])-height[i];
        }
        return count;
    }
}