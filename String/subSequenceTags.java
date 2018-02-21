package Trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SubSequenceTags {
	
	public static void main(String[] args) {
		
		List<String> targetList = new ArrayList<>();
		targetList.add("abc");
		targetList.add("abc");
		targetList.add("abc");
		
		List<String> availableTagList = new ArrayList<>();
		availableTagList.add("abcd");
		availableTagList.add("abc");
		availableTagList.add("abcd");
		availableTagList.add("abc");
		availableTagList.add("abc");
		availableTagList.add("nade");
		availableTagList.add("abc");
		availableTagList.add("abc");
		availableTagList.add("abc");
		availableTagList.add("stays");
		
		System.out.println(subSequenceTags(targetList, availableTagList));
	}
/*
First Solution
	public static List<Integer> subSequenceTags(List<String> targetList, List<String> availableTagList) {
		// WRITE YOUR CODE HERE
		int a = 0;
		int b = 0;
		HashMap<String, List<Integer>> map = new HashMap<String, List<Integer>>();
		for (int index = 0; index < availableTagList.size(); index++) {
			String tag = availableTagList.get(index);
			for (String tagDesired : targetList) {
				if (tag.equals(tagDesired)) {
					List list = map.get(tagDesired);
					if (list == null) {
						list = new ArrayList<Integer>();
						map.put(tagDesired, list);
						System.out.println("Map values "+map);
					}
					list.add(index);
					System.out.println("List values : "+list);
					break;
				}
			}
		}
		// TODO continue
		return Arrays.asList(a, b);
	}
	*/
	/*
  Second Solution
	public static List<Integer> subSequenceTags(List<String> targetList, 
            List<String> availableTagList)
	{
// WRITE YOUR CODE HERE

		List<Integer> ans = new ArrayList<>();

		if (targetList.size() > availableTagList.size()) {
			ans.add(0);
			return ans;
		}

		HashMap<String, Integer> targetHash = new HashMap<>();

		for (String tag : targetList) {
			String str = tag.toLowerCase();
			targetHash.put(str, targetHash.getOrDefault(str, 0) + 1);
		}

		int start = 0;
		int end = 0;
		int ansStart = 0;
		int ansEnd = availableTagList.size() - 1;
		int min = Integer.MAX_VALUE;
		int count = targetList.size();
		boolean found = false;

		for (start = 0; start < ansEnd; start++) {
			while (count > 0 && end < availableTagList.size()) {
				String str = availableTagList.get(end).toLowerCase();

				targetHash.put(str, targetHash.getOrDefault(str, 0) - 1);
				if (targetHash.get(str) >= 0) {
					count--;
				}
				end++;
			}

			if (count == 0) {
				found = true;
				if (min > end - start) {
					min = end - start;
					ansStart = start;
					ansEnd = end - 1;
				}

				String cur = availableTagList.get(start).toLowerCase();

				targetHash.put(cur, targetHash.get(cur) + 1);

				if (targetHash.get(cur) > 0) {
					if(count == 0) {
						start = 0;
						end = 0;
					}
					end++;
					count++;
					
				}
				if(count == targetList.size()){
					if (min > end - start) {
						min = end - start;
						ansStart = start;
						ansEnd = end - 1;
					}
				}
				
			}
		}

		if (!found) {
			ans.add(0);
			return ans;
		}

		ans.add(ansStart);
		ans.add(ansEnd);
		return ans;
	}

*/
	static List<Integer> subSequenceTags(List<String> targetList, List<String> availableTagList) {
        // WRITE YOUR CODE HERE
        List<Integer> indexList = new ArrayList<>();
        if (targetList == null || targetList.isEmpty() || availableTagList == null || availableTagList.isEmpty()) {
            indexList.add(0);
            return indexList;
        }
        int tListSize = targetList.size();
        int aListSize = availableTagList.size();

        int maxIndexDiff = Integer.MAX_VALUE;
        int minIndex = Integer.MIN_VALUE;
        int maxIndex = Integer.MAX_VALUE;
        for (int i = 0; i <=aListSize - tListSize; i++) {

            for (int j = tListSize; i+j <= aListSize; j++) {

                String[] tempArr = new String[j];
                System.arraycopy(availableTagList.toArray(), i, tempArr, 0, j);
                System.out.println(Arrays.toString(tempArr));
                List<String> tempList = Arrays.asList(tempArr);
                if(tempList.containsAll(targetList))
                {
                    int diff=j<0?-j: j;
                    if(maxIndexDiff>diff)
                    {
                        //  System.out.println(i+" "+j+"==>"+Arrays.asList(tempArr).toString());
                        maxIndexDiff=j;
                        minIndex=i;
                        maxIndex=i+j-1;
                    }

                }

            }
        }

        if(minIndex==Integer.MIN_VALUE && maxIndex==Integer.MAX_VALUE)
            indexList.add(0);
        else
        {
            indexList.add(minIndex);
            indexList.add(maxIndex);
        }
        return indexList;
    }
}
