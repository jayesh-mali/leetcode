class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        // int max = Integer.MIN_VALUE;
        int profit = 0;
        for(int i=0; i<prices.length; i++){
            profit = Math.max(profit, prices[i]-min);
            min = Math.min(min, prices[i]);
            // max = Math.max(max, prices[i]);
            
        }
        return profit;
    }
}

/*
[7,1,5,3,6,4]
min = 7
max = inf

1=>
min = 1
max = 1
profit = 0

5=>
min = 1
max = 5
profit = 4

3=>
min = 1
max = 5
profit = 4

6=>
min = 1
max = 6
profit = 5
*/