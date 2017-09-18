/* 344. Reverse String
Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".
*/

class Solution {
    public String reverseString(String s) {
        int n = s.length();
        int i = n-1 , j=0;
        char[] reversed = s.toCharArray();
        char temp = ' ';
        if( s.length() <= 1 || s.isEmpty())
            return s;
        while(i>j){
            temp = reversed[i];
            reversed[i] = reversed[j];
            reversed[j] = temp;
            i--;
            j++;      
        }
        return  String.valueOf(reversed);
    }
}
