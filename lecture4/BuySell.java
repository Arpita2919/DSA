public class BuySell{
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        int maxProfit = 0;
        for(int sell = 0; sell < prices.length; sell++) {
            int minBuy = Integer.MAX_VALUE;
            for(int buy = 0; buy < sell; buy++) {
                minBuy = Math.min(minBuy, prices[buy]);
            }

            int profit = prices[sell] - minBuy;
            maxProfit = Math.max(maxProfit, profit);
        }
        System.out.println(maxProfit); 
    }
}
// T.C.:- O(N^2)
// S.C.:- O(1)