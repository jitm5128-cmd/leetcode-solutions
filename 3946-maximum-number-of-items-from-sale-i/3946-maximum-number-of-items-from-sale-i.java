class Solution {
    public int maximumSaleItems(int[][] items, int budget) {
        int n = items.length;
        int[] gain = new int[n];

        for(int i=0; i<n; ++i){
            gain[i]=1;

            for(int j=0;j<n;j++){
                if(i != j && items[j][0] % items[i][0]==0){
                    gain[i]++;
                }
            }
        }

        int[] dp = new int[budget+1];
        for(int i=0; i<n; ++i){
            int price = items[i][1];
            int[] itm = dp.clone();

            for(int b = budget; b>=price;b--){
                itm[b] = Math.max(
                    itm[b],
                    dp[b-price] +gain[i]
                );
            }
            for(int b=price; b<=budget; b++){
                itm[b] = Math.max(
                    itm[b],
                    itm[b-price] +1
                );
            }
            dp =itm;
        }
        int ans=0;
        for(int x:dp){
            ans = Math.max(ans, x);
        }
        return ans;
    }
}