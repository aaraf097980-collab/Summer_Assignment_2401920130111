
// LeetCode 121 - Best Time to Buy and Sell Stock
// Time Complexity: O(n)
// Space Complexity: O(1)

    public class BuySellStock {
    public int maxprofit(int [] prices ){
        int  n=prices.length;
        int mini=prices[0];
        int profit=0;
        for (int i=0;i<n;i++)
        {
            int cost=prices[i]-mini;
            profit=Math.max(profit,cost);
            mini=Math.min(mini,prices[i]);
        }
        return profit ;
    }
    public static void main (String [] args ){
        BuySellStock obj=new BuySellStock();
        int [] prices ={7,6,4,3,1};
        System.out.println(obj.maxprofit(prices));
    }
}
