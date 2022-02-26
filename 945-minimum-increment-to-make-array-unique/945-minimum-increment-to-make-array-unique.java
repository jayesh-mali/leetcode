class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int maxSoFar = nums[0];
        int opCount = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i] <= maxSoFar){
                opCount += (maxSoFar - nums[i] + 1);
                maxSoFar++;
            }else{
                maxSoFar = nums[i];
            }
        }
        return opCount;
    }
}