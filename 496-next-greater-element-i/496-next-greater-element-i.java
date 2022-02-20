class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        if(nums2.length==0) return result;
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for(int i=nums2.length-1; i>=0; i--){
            if(stack.isEmpty()){
                map.put(nums2[i], -1);
            }else if(stack.peek() > nums2[i]){
                map.put(nums2[i], stack.peek());
            }else{
                while(!stack.isEmpty() && stack.peek()<nums2[i]){
                    stack.pop();
                }
                int temp = stack.isEmpty() ? -1 : stack.peek();
                map.put(nums2[i], temp);
            }
            stack.push(nums2[i]);
        }
        
        for(int i=0; i<nums1.length; i++){
            result[i] = map.get(nums1[i]);
        }
        return result;
    }
}