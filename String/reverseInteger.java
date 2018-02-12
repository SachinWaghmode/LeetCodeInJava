/*
7. Reverse Integer

Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output:  321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range. 
For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

*/

class Solution {
    public int reverse(int x) {
        
        long rNum = 0;
        while( Math.abs(x) >= 10){
            rNum = rNum * 10;
            rNum += (x % 10);
            x = x / 10;
        }
        if (x != 0){
             rNum = rNum * 10;
            rNum += x;
        }
        if (rNum >= Integer.MAX_VALUE || rNum <= Integer.MIN_VALUE) return 0;
        int result = (int) rNum;
        return result;
    }
}
