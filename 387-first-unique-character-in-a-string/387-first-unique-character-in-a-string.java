class Solution {
    public int firstUniqChar(String s) {
        int[] freqArr = getFreqArr(s);
        for(int i=0; i<s.length(); i++){
            if(freqArr[s.charAt(i)-'a']==1)
                return i;
        }
        return -1;
    }
    
    private int[] getFreqArr(String s){
        int[] arr = new int[26];
        for(char ch: s.toCharArray()){
            arr[ch-'a']++;
        }
        return arr;
    }
}