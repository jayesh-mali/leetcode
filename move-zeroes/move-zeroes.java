class Solution {
    public void moveZeroes(int[] nums) {
        int zeroCount = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                zeroCount++;
            }
            else{
                nums[i-zeroCount] = nums[i];
            }
        }
        int start = nums.length - zeroCount;
        for(int i=start; i<nums.length; i++){
            nums[i] = 0;
        }
    }
}