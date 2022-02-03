class Solution {
    public int removeDuplicates(int[] nums) {
        int actualIndex = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
                if(actualIndex<i)
                    nums[actualIndex] = nums[i];
                actualIndex++;
            }
        }
        return actualIndex;
    }
}
/*
     i
[0,0,1,1,1,2,2,3,3,4]
[0]

[0,1,2,1,2,2,3,3,4]


            a,i  
[1,  2,  3, 4]

*/