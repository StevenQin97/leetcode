import java.util.Map;
import java.util.Objects;

public class FinalPricesSolution {
    public static int[] finalPrices(int[] prices) {
        int len = prices.length;
        for(int i = 0; i < len;i++){
            for (int j = i+1;j<len ;j++){
                if(prices[j] <= prices[i] ){
                    prices[i] -= prices[j];
                    break;
                }
            }
        }
        return prices;
    }

    public static void main(String[] args) {
        int[] prices = new int[]{10,1,1,6};
        prices = finalPrices(prices);
        for(int i = 0;i<prices.length;i++){
            System.out.print(prices[i]);
        }
    }
}
