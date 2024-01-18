class Solution {
    public int maxProduct(int[] nums) {
        int preMax = nums[0];
        int preMin = nums[0];
        int currentMin = nums[0];
        int currentMax = nums[0];
        int ans = nums[0];
        for(int i=1; i<nums.length; i++){
            currentMax = Math.max(Math.max(nums[i]*preMax, nums[i]), nums[i]*preMin);
            currentMin = Math.min(Math.min(nums[i]*preMin, nums[i]), nums[i]*preMax);
            ans = Math.max(ans, currentMax);
            preMax = currentMax;
            preMin = currentMin;
        }
        return ans;
    }
}