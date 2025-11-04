package LeetCode;

public class BuyAndSell {
    public int maxProfit(int[] prices) {


    int buyPrice=prices[0];
    int maxProfit =0;
    int currentProfit =0;


        for (int price : prices) {
            if (price < buyPrice) {
                buyPrice = price;
            } else {
                currentProfit = price - buyPrice;
            }
            if (currentProfit > maxProfit) {
                maxProfit = currentProfit;
            }


        }
      return maxProfit;


    }
}
