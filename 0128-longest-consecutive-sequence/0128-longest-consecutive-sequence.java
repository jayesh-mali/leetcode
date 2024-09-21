class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        Map<Integer, Integer> map = new HashMap<>();
        int maxSoFar = 0;
        for (int i = 0; i < nums.length; i++) {
            int localCount = recursive(set, map, nums[i]);
            map.put(nums[i], localCount);
            maxSoFar = Math.max(maxSoFar, localCount);
        }
        return maxSoFar;
    }
    
    public int recursive(Set<Integer> set, Map<Integer, Integer> map, int num) {
        if (!set.contains(num)) {
            return 0;
        }
        if (map.containsKey(num)) {
            return map.get(num);
        }
        int result = recursive(set, map, num - 1) + 1;
        map.put(num, result);
        return result;
    }
}