package LeetCode;

public class BuyAndSellV2 {
    public static void main(String[] args) {

        int[] prices = new int[] {7,1,5,3,6,4};
        int buyPrice=prices[0];
        int totalProfit =0;
        int currentProfit =0;


        for (int i = 1; i <prices.length ; i++) {


        if (prices[i] < buyPrice) {
            buyPrice = prices[i];

        } else {
            currentProfit = prices[i] - buyPrice;



        }
            if (prices[i] > prices[i - 1]) {
                totalProfit += currentProfit;
                buyPrice=prices[i];

            }

    }
            System.out.println(totalProfit);
    }
}


