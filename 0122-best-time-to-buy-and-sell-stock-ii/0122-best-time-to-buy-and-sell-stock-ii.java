class Solution {
    public int maxProfit(int[] prices) {
        int Maxprofit = 0;

            for(int CurrentDay = 1;CurrentDay<prices.length;++CurrentDay){
                int DailyProfit = prices[CurrentDay] - prices[CurrentDay-1]; 
                Maxprofit = Maxprofit+Math.max(0, DailyProfit);
        }
        return Maxprofit;
    }
}