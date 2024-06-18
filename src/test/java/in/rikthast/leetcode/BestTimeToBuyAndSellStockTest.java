package in.rikthast.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {
  @Test
  void multipleDayPricesWithProfit() {
    int[] prices = new int[]{ 7,1,5,3,6,4 };
    int expectedProfit = 5;
    assertEquals(expectedProfit, BestTimeToBuyAndSellStock.call(prices));
  }

  @Test
  void multipleDayPricesWithMultipleLocalProfits() {
    int[] prices = new int[]{ 7,1,5,3,6,4,1,8,4,2,5 };
    int expectedProfit = 7;
    assertEquals(expectedProfit, BestTimeToBuyAndSellStock.call(prices));
  }

  @Test
  void multipleDayDowntrendPrices() {
    int[] prices = new int[]{ 7,6,4,3,1 };
    int expectedProfit = 0;
    assertEquals(expectedProfit, BestTimeToBuyAndSellStock.call(prices));
  }

  @Test
  void singleDayPrices() {
    int[] prices = new int[]{ 1 };
    int expectedProfit = 0;
    assertEquals(expectedProfit, BestTimeToBuyAndSellStock.call(prices));
  }
}
