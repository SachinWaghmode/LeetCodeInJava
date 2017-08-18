/* 551. Student Attendance Record I
You are given a string representing an attendance record for a student. The record only contains the following three characters:

'A' : Absent.
'L' : Late.
'P' : Present.
A student could be rewarded if his attendance record doesn't contain more than one 'A' (absent) or more than two continuous 'L' (late).

You need to return whether the student could be rewarded according to his attendance record.

*/

public class Solution {
    public boolean checkRecord(String s) {
        int countL=0, countA =0;
        for(int i=0; i<s.length(); i++)
        {
            if (s.charAt(i)=='A')
            {
                countA++;
                countL=0;
            }
            else if(s.charAt(i)=='L')
            {
                countL++; 
            }
            else
                countL=0;
                
            if (countA > 1 || countL > 2)
                return false;
        }
        return true;
    }
}

/* Recommended Solution 

public boolean checkRecord(String s) {
    return !s.matches(".*LLL.*|.*A.*A.*");
}

*/

