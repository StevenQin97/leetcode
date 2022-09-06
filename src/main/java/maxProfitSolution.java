import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class maxProfitSolution {
    public int maxProfit(int[] prices) {
        int res = 0;
        int len = prices.length;
        int low = prices[0];
        for (int i = 1; i < len; i++) {
            if(prices[i] > low){
                res = Math.max(prices[i]-low,res);
            }
            if(prices[i] <= low){
                low = prices[i];
            }
        }
        return res;
    }
}
