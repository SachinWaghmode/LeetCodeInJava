/* Problem number : 219
Given an array of integers and an integer k, 
find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] 
and the absolute difference between i and j is at most k.
*/
// this solution has time limit exceeded since it is O(n^2)

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int max=0;
        int r=0;
        for(int i=0; i<=nums.length-1; i++)
        {
            for(int j=0; j<i; j++)
            {
                if (nums[j]==nums[i])
                {
                    r=Math.abs(i-j);
                    if(r<=k)
                       return true;
                }
            }
        }
        return false;
    }
}

/* Recommended Solution using HashMap

public boolean containsNearbyDuplicate(int[] nums, int k) {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
 
    for(int i=0; i<nums.length; i++){
        if(map.containsKey(nums[i])){
            int pre = map.get(nums[i]);
            if(i-pre<=k)
                return true;
        }
 
        map.put(nums[i], i);
    }
 
    return false;
}

Recommended Solution using Hashset

public boolean containsNearbyDuplicate(int[] nums, int k) {
    if(nums==null || nums.length<2 || k==0)
        return false;
 
    int i=0; 
 
    HashSet<Integer> set = new HashSet<Integer>();
 
    for(int j=0; j<nums.length; j++){
        if(!set.add(nums[j])){
            return true;
        }            
 
        if(set.size()>=k+1){
            set.remove(nums[i++]);
        }
    }
 
    return false;
}
*/



