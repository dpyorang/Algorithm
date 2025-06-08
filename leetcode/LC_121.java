/* https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/1657355328/ */

public class LC_121 {
    public static void main(String[] args) {
        LC_121 lc = new LC_121();
        System.out.println(lc.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    public int maxProfit(int[] prices) {
        int result = 0;

        int min = 100001;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else if (prices[i] > min) {
                if (result < prices[i] - min) {
                    result = prices[i] - min;
                }
            }
        }

        return result;
    }
}
