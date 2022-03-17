class Solution {
    public boolean winnerSquareGame(int n) {
        boolean[] dp = new boolean[n+1];
        dp[0] = false; //[false, true, false]
        for(int i=1; i<=n; i++){
            for(int j=1; j*j<=i; j++){ //i=1, 2
                if(i-(j*j)>=0 && !dp[i-(j*j)]){
                    dp[i] = true;
                    break;
                }
                    
            }
        }
        return dp[n];
    }
}