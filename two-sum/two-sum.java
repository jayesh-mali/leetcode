class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hash = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int comp = target-nums[i];
            if(hash.containsKey(comp)){
                return new int[]{i, hash.get(comp)};
            }
            hash.put(nums[i],i);
        }
        return new int[2];
    }
}