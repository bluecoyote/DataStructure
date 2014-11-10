public class MaxProfit {
    public int maxProfit(int[] prices) {
        boolean buyOrNot = false;
        int buy = 0;
        int count = 0;
        int len = prices.length;
        int i = 0;
        for(; i < len - 1; i++){
            if(prices[i] < prices[i+1]){
                if(buyOrNot == true) continue;
                buy = prices[i];
                buyOrNot = true;
            }else{
                if(buyOrNot == true){
                    count += prices[i] - buy;
                    buyOrNot = false;
                }
            }
        }
        if(buyOrNot == true && i == len-1) count += prices[len-1] - buy;
        return count;
    }
}