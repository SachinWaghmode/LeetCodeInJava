/*
70. Climbing Stairs

You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Note: Given n will be a positive integer.


Example 1:

Input: 2
Output:  2
Explanation:  There are two ways to climb to the top.

1. 1 step + 1 step
2. 2 steps
Example 2:

Input: 3
Output:  3
Explanation:  There are three ways to climb to the top.

1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step

*/

public static int noOfWays(int n){
		int total = 0;
		int two_step = 1;
		int one_step = 2;
		
		if (n<=0) return 0;
		if (n==1) return 1;
		if (n==2) return 2;
		
		for(int i=2; i<n; i++){
			total = one_step + two_step;
			two_step = one_step;
			one_step = total;			
		}
		return total;
	}
  
  
  /* There are two ways to climb over stair case
 *  One way is take one step at a time
 *  Second way is to take two steps at a time
 *  In order to climb over 3rd step--> it is addition of number of ways to climb 1st step and number of ways to climb 2st step.
 *  Hence total number of ways to climb n steps is going to be addition of number of ways to climb n-1 steps and number of ways to climb n-2 steps.
 */
