// you can also use imports, for example:

import java.util.*;

import java.lang.*;

// you can write to stdout for debugging purposes, e.g.

// System.out.println("this is a debug message");



class Solution {

    public int solution(String A, String B) {

        

        // write your code in Java SE 8

        int numOfCards= A.length();

        int AlecWinCount=0;

        for(int i=0;i< numOfCards;i++){

                boolean result=checkAlecWins(A.charAt(i),B.charAt(i));

                if(result)

                    AlecWinCount++;

            }

            return AlecWinCount;

        }

    private static boolean checkAlecWins(char a,char b){

       String s ="AKQJT";

        

         if(Character.isDigit(a) && Character.isDigit(b)){

                return a>b;

          }//If Alec card is not digit and Bob's card is digit

        else if(!Character.isDigit(a) && Character.isDigit(b))

                return true;

        else if(Character.isDigit(a) && !Character.isDigit(b)){

                return false;

                }

       else{

           int first = s.indexOf(a);

           int second = s.indexOf(b);

           if(first<second){

               return true;

             }

           }

            

        return false;

    }

}





//you can also use imports, for example:

import java.util.*;



//you can write to stdout for debugging purposes, e.g.

//System.out.println("this is a debug message");



class Solution {

 public int solution(int[] A) {

     // write your code in Java SE 8

     if(A.length <= 1){

         return A.length;

     }

     //Create a set of distinct locations

     HashSet<Integer> setLocations= new HashSet<Integer>();

     for(Integer location: A){

         setLocations.add(location);

     }

     

     int left=0;

     int right= 1;

     while(right < A.length && !setLocations.isEmpty()){

         setLocations.remove(A[right]);

             if(A[right] != A[left]){

                 right++;

             }

             else if(A[right] == A[left]){

                 left++;

                 right++;

             }

     }

     return right- left;

     

 }

}
