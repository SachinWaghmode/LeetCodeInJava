/*121. Best Time to Buy and Sell Stock

Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Example 1:
Input: [7, 1, 5, 3, 6, 4]
Output: 5

max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)
Example 2:
Input: [7, 6, 4, 3, 1]
Output: 0

In this case, no transaction is done, i.e. max profit = 0.
*/


public class Solution {
    public int maxProfit(int[] prices) {
        int max=0,min=Integer.MAX_VALUE;
        if(prices.length<=1)
            return 0;
        for(int i=0; i<prices.length-1; i++)
        {
           
            min = Math.min(min, prices[i]);
            if(prices[i+1]>prices[i])
            {
                 max = Math.max(max, Math.abs(prices[i+1]-min));
            }
            
        }
        return max;
    }
}


/*Recommended Solution

public class Solution {
    public int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }
}
*/
