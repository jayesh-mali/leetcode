class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] copy = nums.clone();
        int i=0;
        while(i+k<nums.length){
            nums[i+k] = copy[i];
            i++;
        }
        int j=0;
        while(i<nums.length){
            nums[j++] = copy[i++];
        }
    }
}
/*
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]

[1,2,3,4,5,6,7]
i=0, k=1
[1,1,2,3,4,5,6]
i=6
[7,1,2,3,4,5,6]
*/