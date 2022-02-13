class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq1 = getFreqArr(s);
        int[] freq2 = getFreqArr(t);
        return Arrays.equals(freq1, freq2);
    }
    
    private int[] getFreqArr(String s){
        int[] arr = new int[26];
        for(char ch: s.toCharArray()){
            arr[ch-'a']++;
        }
        return arr;
    }
}