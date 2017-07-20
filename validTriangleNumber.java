/*611. Valid Triangle Number
Given an array consists of non-negative integers, your task is to count the number of triplets chosen from the array that can make triangles if we take them as side lengths of a triangle.

Example 1:
Input: [2,2,3,4]
Output: 3
Explanation:
Valid combinations are: 
2,3,4 (using the first 2)
2,3,4 (using the second 2)
2,2,3

Note:
The length of the given array won't exceed 1000.
The integers in the given array are in the range of [0, 1000].
*/

public class Solution {
    public int triangleNumber(int[] nums) {
        int count=0;
        if (nums.length <=2)
            return 0;
        Arrays.sort(nums);
        for(int i=nums.length-1; i>=2; i--)
        {
            int side1=0, side2= i-1; 
            while(side1 < side2)
            {
                if (nums[i] < (nums[side1] + nums[side2]))
                {
                    count+= side2-side1;
                    side2--;
                }
                else
                {
                    side1++;
                }
            }   
        }
        return count;
    }
}
