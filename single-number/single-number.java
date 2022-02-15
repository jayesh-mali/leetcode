class Solution {
    
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int n: nums){
            result = result ^ n;
        }
        return result;
    }
    
    /*
    public int singleNumber(int[] nums) {
        int result = nums[0];
        for(int i=1; i<nums.length; i++){
            result = result ^ nums[i];
        }
        return result;
    }
    */
}