class Solution {
    public int maxProfit(int[] prices) {
        int maxi=0;
        int mini=prices[0];
        for(int i=1;i<prices.length;i++){
            int cost=prices[i]-mini;
            maxi=Math.max(maxi,cost);
            mini=Math.min(prices[i],mini);
        }
        return maxi;
    }
}