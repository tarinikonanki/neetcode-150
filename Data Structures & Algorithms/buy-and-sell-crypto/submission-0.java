class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxSell = 0;

        for(int price : prices){
            if(price < min){
                min = price;
            }
            else if(price - min > maxSell){
                maxSell = price - min;
            }
        }
        return maxSell;
    }
}
