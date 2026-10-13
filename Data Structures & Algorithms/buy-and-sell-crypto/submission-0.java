class Solution {
    public int maxProfit(int[] prices) {
        int l=0;
        int r=prices.length;
        int max=0;
        int sum=0;
        for(int i=0;i<r;i++){
            for(int j=i+1;j<r;j++){
                sum=(prices[j]-prices[i]);
                max=Math.max(max,sum);
            }
        }return max;
    }
}
