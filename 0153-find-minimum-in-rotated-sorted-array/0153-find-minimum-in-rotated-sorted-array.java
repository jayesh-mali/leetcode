class Solution {
    public int findMin(int[] nums) {
        if(nums[0] <= nums[nums.length-1])
            return nums[0];
        return findMin(nums, 0, nums.length-1);
    }
    
    public int findMin(int[] nums, int left, int right){
        if(right < left) return -1;
        int mid = left+(right-left)/2;
        if(mid == 0){
            return Math.min(nums[left], nums[right]);
        }
        else if(nums[mid] < nums[mid-1]){
            return nums[mid];
        }else if(nums[mid] > nums[right]){
            return findMin(nums, mid+1, right);
        }else{
            return findMin(nums, left, mid-1);
        }
    }
}