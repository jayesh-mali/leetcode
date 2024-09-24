class Solution {
    
    public boolean checkInclusion(String s1, String s2) {
         if (s1.length() > s2.length()) {
            return false;
        }
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i) - 'a']++;
            freq2[s2.charAt(i) - 'a']++;
        }
        int totalMatches = 0;
        for (int i = 0; i < freq1.length; i++) {
            if (freq1[i] == freq2[i]) {
                totalMatches++;
            }
        }
        if(totalMatches==26){
            return true;
        }
        int left = 0;
        for (int i = s1.length(); i < s2.length(); i++) {
            freq2[s2.charAt(i) - 'a']++;
            if(freq2[s2.charAt(i) - 'a'] == freq1[s2.charAt(i) - 'a']){
                totalMatches++;
            }else if(freq2[s2.charAt(i) - 'a'] == freq1[s2.charAt(i) - 'a']+1){
                totalMatches--;
            }
            freq2[s2.charAt(left) - 'a']--;
            if(freq2[s2.charAt(left) - 'a'] == freq1[s2.charAt(left) - 'a']){
                totalMatches++;
            }else if(freq2[s2.charAt(left) - 'a'] == freq1[s2.charAt(left) - 'a']-1){
                totalMatches--;
            }
            left++;
            if (totalMatches == 26) {
                return true;
            }
        }
        return false;
    }
}