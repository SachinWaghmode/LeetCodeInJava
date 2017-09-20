/*
Given a string and an integer k, you need to reverse the first k characters for every 2k characters counting from the start of the string. If there are less than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and left the other as original.
Example:
Input: s = "abcdefg", k = 2
Output: "bacdfeg"
Restrictions:
The string consists of lower English letters only.
Length of the given string and k will in the range [1, 10000]

*/

class Solution {
    public String reverseStr(String s, int k) {
        int n = s.length();
        char[] result = s.toCharArray();
        int i=0;
        while(i<n){
           int j = Math.min(i+k-1, n-1); // set j to last character in 2k chunk
            reverse(result,i,j);         // keep i & j unchanged
            i += 2*k;                    // increment i to next chunk 
            
        }
        return String.valueOf(result);
    }
    
    private void reverse(char[] result, int l, int r){
        
        while(l<r ){
            char temp = result[l];      // swap chunk of k characters 
            result[l++] = result[r];
            result[r--] = temp;
            
        }
    }
}
