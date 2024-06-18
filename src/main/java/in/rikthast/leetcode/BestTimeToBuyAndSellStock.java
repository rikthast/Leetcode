package in.rikthast.leetcode;

public class BestTimeToBuyAndSellStock {
  public static int call(int[] prices) {
    int minPrice = prices[0];
    int maxProfit = 0;

    for(int index = 1; index < prices.length; index++) {
      int localProfit = prices[index] - minPrice;
      if (prices[index] < minPrice) {
        minPrice = prices[index];
      } else if(localProfit > maxProfit) {
        maxProfit = localProfit;
      }
    }

    return maxProfit;
  }
}
