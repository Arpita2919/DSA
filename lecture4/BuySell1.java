public class BuySell1 {
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        int maxProfit = 0;
        int minBuy = Integer.MAX_VALUE;
        for(int sell = 0; sell < prices.length; sell++) {
            int profit = prices[sell] - minBuy;
            maxProfit = Math.max(maxProfit, profit);
            minBuy = Math.min(minBuy, prices[sell]);
        }

        System.out.println(maxProfit);
    
    }
}
  // T.C.:- O(N)
    // S.C.:- O(1)