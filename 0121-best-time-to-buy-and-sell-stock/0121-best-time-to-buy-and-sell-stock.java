class Solution {
    public int maxProfit(int[] prices) {
        int maxPrice=0;
        int minPrice=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<minPrice)
            {
                minPrice=prices[i];
            }
            maxPrice=Math.max(maxPrice,prices[i]-minPrice);

        }
        return maxPrice;
    }
}