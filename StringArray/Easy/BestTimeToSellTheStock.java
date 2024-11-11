package LeetCode.StringArray.Easy;

public class BestTimeToSellTheStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        int maxprofit = 0;
        int l =0;
        int r =1;
        while(r<prices.length){
            if(prices[r]>prices[l]){
                maxprofit = Math.max(maxprofit,prices[r]-prices[l]);
            }else{
                l = r;
            }
            r++;
        }

        return maxprofit;


        }
}
