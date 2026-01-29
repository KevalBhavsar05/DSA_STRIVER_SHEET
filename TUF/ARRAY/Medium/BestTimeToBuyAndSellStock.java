
public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int diff = 0;
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            diff = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, diff);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 6, 4, 3, 1 };
        System.out.println(maxProfit(prices));
    }
}
