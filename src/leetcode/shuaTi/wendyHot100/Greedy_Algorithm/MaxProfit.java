package leetcode.shuaTi.wendyHot100.Greedy_Algorithm;

public class MaxProfit {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = 0;
        boolean isbuy = false;
        int sell = 0;
        boolean issell = false;
        for(int i=0;i<prices.length;i++){
            if((i !=prices.length-1 && prices[i]<prices[i+1]) && isbuy==false){
                buy = prices[i];
                isbuy = true;
            }
            if((i==prices.length-1 || prices[i]>prices[i+1]) && issell==false && isbuy==true){
                sell = prices[i];
                issell = true;
            }
            if(isbuy && issell){
                profit = profit + sell - buy;
                isbuy = false;
                issell = false;
            }
        }

        return profit;
    }
}
