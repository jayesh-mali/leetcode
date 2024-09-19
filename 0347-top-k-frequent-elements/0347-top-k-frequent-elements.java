class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        List<Integer>[] count = new List[nums.length + 1];
        for(int i=0; i<count.length; i++){
            count[i] = new ArrayList<>();
        }
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            List<Integer> list = count[entry.getValue()];
            list.add(entry.getKey());
        }
        int[] result = new int[k];
        int index = 0;
        for(int i=nums.length; i>=0 && index<result.length; i--){
            for(int num: count[i]){
                if(index < result.length){
                    result[index] = num;
                    index++;
                }else{
                    break;
                }
            }
        }
        return result;
    }
}