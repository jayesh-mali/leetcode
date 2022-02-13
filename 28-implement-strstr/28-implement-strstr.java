class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty())
            return 0;
        int[] pi = buildPI(needle);
        int i=0, j=0;
        int hLen = haystack.length();
        int nLen = needle.length();
        while(i < hLen){
            if(haystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;
            }else{
                if(j==0)
                    i++;
                else
                    j = pi[j-1];
            }
            if(j==nLen)
                return i-j;
        }
        return -1;
    }
    
    private int[] buildPI(String s){
        int[] arr = new int[s.length()];
        int i=0;
        int j=1;
        while(j<s.length()){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                arr[j] = i;
                j++;
            }else{
                if(i==0)
                    j++;
                else
                    i = arr[i-1];
            }
        }
        return arr;
    }
}