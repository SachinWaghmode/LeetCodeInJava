/* 167. Two Sum II - Input array is sorted
Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution and you may not use the same element twice.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2
*/


public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] resultantIndex = new int[2];
        int j=0,i=0;
        int n= numbers.length-1;
        while(i<n)
            {
                if(target - numbers[i] == numbers[n] )
                {
                    resultantIndex[j] = i+1;
                    resultantIndex[j+1] = n+1;
                    break;
                 }
                else if(target - numbers[i] < numbers[n] )
                {
                    n--;
                }
                else
                {
                    i++;
                }
            }
         return resultantIndex;
        
    }
}


/* Recommended Solution

public int[] twoSum(int[] num, int target) {
    int[] indice = new int[2];
    if (num == null || num.length < 2) return indice;
    int left = 0, right = num.length - 1;
    while (left < right) {
        int v = num[left] + num[right];
        if (v == target) {
            indice[0] = left + 1;
            indice[1] = right + 1;
            break;
        } else if (v > target) {
            right --;
        } else {
            left ++;
        }
    }
    return indice;
}

*/
