class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for(int i=digits.length-1; i>=0; i--){
            int num = digits[i] + carry;
            digits[i] = num % 10;
            carry = num / 10;
        }
        if(carry>0){
            int[] result = new int[digits.length+1];
            result[0] = carry;
            for(int i=0; i<digits.length; i++){
                result[i+1] = digits[i];
            }
            return result;
        }else{
            return digits;
        }
        
    }
}