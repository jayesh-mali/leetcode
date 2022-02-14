class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for(int i=0; i<prices.length; i++){
            if(prices[i] > min){
                profit += prices[i] - min;
                min = prices[i];
            }
            min = Math.min(min, prices[i]);
        }
        return profit;
    }
    
    /*
    [7, 1, 5, 3, 6, 4]
    min = inf
    profit = 0
    
    7=>
    min = 7
    profit = 0
    
    1=>
    min = 1
    profit = 0
    
    5=>
    min = 5
    profit = 4
    
    3=>
    min = 3
    profit = 4
    
    6=>
    min = 6
    profit = 7
    
    4=>
    min = 4
    profit = 7
    
    */
}