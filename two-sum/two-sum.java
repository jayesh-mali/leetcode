class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hash = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            hash.put(nums[i], i);
        }
        for(int i=0; i<nums.length; i++){
            int comp = target-nums[i];
            if(hash.containsKey(comp) && hash.get(comp)!=i){
                return new int[]{i, hash.get(comp)};
            }
        }
        return new int[2];
    }
}