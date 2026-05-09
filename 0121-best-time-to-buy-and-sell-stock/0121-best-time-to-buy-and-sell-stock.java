class Solution {
    public int maxProfit(int[] prices) {
        int Maxprofit = 0;
        int MinimumStockprice = prices[0];

        for(int CurrentDayPrice : prices){
            Maxprofit = Math.max(Maxprofit, CurrentDayPrice - MinimumStockprice);
            MinimumStockprice = Math.min(MinimumStockprice, CurrentDayPrice);
        }
        return Maxprofit;




    }
}