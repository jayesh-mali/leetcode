class Solution {
    public int myAtoi(String s) {
        int sign = 1;
        int result = 0;
        boolean operatorSet = false;
        boolean digitStarted = false;
        for(char ch: s.toCharArray()){
            if(ch == ' '){
                if(result==0 && !digitStarted)
                    continue;
                else
                    break;
            } 
            if(isOperator(ch)){
                if(operatorSet || digitStarted)
                    break;
                if(ch=='-')
                    sign = -1;
                operatorSet = true;
                digitStarted = true;
                continue;
            }
            digitStarted = true;

            if(!Character.isDigit(ch))
                break;
            int boundary = Integer.MAX_VALUE/10;
            if(result < boundary){
                result = add(result, ch);    
            }else if(result > boundary){
                return sign==1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }else{
                if(Character.getNumericValue(ch) <= 7){
                    result = add(result, ch);
                }else{
                    return sign==1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
            }
            
        }
        return result*sign;
    }
    
    private int add(int result, char ch){
        return result*10+Character.getNumericValue(ch);
    }
    
    private boolean isOperator(char ch){
        return ch=='+' || ch=='-';
    }
}