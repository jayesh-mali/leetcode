class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        int low = 0;
        int high = str.length()-1;
        while(low < high){
            if(!Character.isLetterOrDigit(str.charAt(low)))
                low++;
            else if(!Character.isLetterOrDigit(str.charAt(high)))
                high--;
            else if(str.charAt(low) != str.charAt(high)) {
                return false;
            }else{
                low++;
                high--;
            }
        }
        return true;
    }
}