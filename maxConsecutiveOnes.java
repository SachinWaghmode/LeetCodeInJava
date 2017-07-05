public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int countOnes=0;
        int prevCount=0;
        for (int i=0; i<nums.length; i++)
        {
            if (nums[i]==1)
            {
                countOnes++;
                if( i==nums.length-1)
                {
                    if(countOnes > prevCount)
                        prevCount = countOnes;
                    return prevCount;
                }
            }
            else{
                if(countOnes > prevCount)
                {
                    prevCount = countOnes;
                }
                    countOnes = 0;
                    
            }
        }
        return prevCount;
        
    }
}
