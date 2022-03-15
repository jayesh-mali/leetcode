class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<Integer>();
        int[] result = new int[nums.length];
        Arrays.fill(result, -1);
        int n = nums.length;
        for(int i=0; i<n*2; i++){
            while(!stack.isEmpty() && nums[stack.peek()] < nums[i%n]){
                result[stack.pop()] = nums[i%n];
            }
            if(i<n)
                stack.push(i);
        }
        return result;
    }
}