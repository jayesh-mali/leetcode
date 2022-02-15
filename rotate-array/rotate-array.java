class Solution {
    //with reverse in O(1) space
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }
    
    private void reverse(int[] arr, int start, int end){
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    
    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    /* with extra memory
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
    */
}
/*
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]

[1,2,3,4,5,6,7]
[4,3,2,1,5,6,7]
[4,3,2,1,7,6,5]

[5,6,7,1,2,3,4]

[1,2,3,4,5,6,7]
[7,6,5,4,3,2,1]
[5,6,7,1,2,3,4]

*/