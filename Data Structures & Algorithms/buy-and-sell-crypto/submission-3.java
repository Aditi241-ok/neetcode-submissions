class Solution {
    public int maxProfit(int[] prices) {
        int l=0;
        int r=1;
        int max=0;
        int sum=0;
        while(r<prices.length){
            if(prices[r]>prices[l]){
            sum=prices[r]-prices[l];
            max=Math.max(sum,max);}
            else{
                l=r;
            }r++;;
        
        }return max;
    }
}
