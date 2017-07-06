public class Solution {
    public int findUnsortedSubarray(int[] nums) { 
        int n=nums.length;
        int max=nums[0],min=nums[n-1],j = -2, k= -1;
        for (int i=1; i<n; i++)
        {
            if(nums[i] < max)
                    j= i;
            else
                  max = nums[i];
            if(nums[n-1-i] > min)
                   k=n-1-i;
         
            else
                min=nums[n-1-i];
        }
        return (j-k+1);
    }
}