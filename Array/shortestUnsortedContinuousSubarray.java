/*
Given an integer array, you need to find one continuous subarray that if you only sort this subarray in ascending order, then the whole array will be sorted in ascending order, too.

You need to find the shortest such subarray and output its length.

Example 1:
Input: [2, 6, 4, 8, 10, 9, 15]
Output: 5
Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.

Note:
Then length of the input array is in range [1, 10,000].
The input array may contain duplicates, so ascending order here means <=.

*/

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

/*
Recommended Solution

public int findUnsortedSubarray(int[] A) {
    int n = A.length, beg = -1, end = -2, min = A[n-1], max = A[0];
    for (int i=1;i<n;i++) {
      max = Math.max(max, A[i]);
      min = Math.min(min, A[n-1-i]);
      if (A[i] < max) end = i;
      if (A[n-1-i] > min) beg = n-1-i; 
    }
    return end - beg + 1;
}
*/
