class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int num: nums){
            xor ^= num;
        }
        int lastBit = xor & (~xor+1);
        int sum1 = 0;
        int sum2 = 0;
        for(int num: nums){
            if((num & lastBit) == 0)
                sum1 ^= num;
            else
                sum2 ^= num;
        }
        int[] result = {sum1, sum2};
        return result;
    }
}