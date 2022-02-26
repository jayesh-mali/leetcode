import java.util.Arrays;
class Solution {
    public int minDeletions(String s) {
        int[] freq = new int[26];
        for(char ch: s.toCharArray()){
            freq[ch-'a']++;
        }
        //freq = Arrays.stream(freq).boxed().sorted(Collections.reverseOrder()).mapToInt(a->a).toArray();
        Set<Integer> set = new HashSet<>();
        int count=0;
        for(int num: freq){
            while(num>0 && set.contains(num)){
                num--;
                count++;
            }
            set.add(num);
        }
        return count;
    }
}