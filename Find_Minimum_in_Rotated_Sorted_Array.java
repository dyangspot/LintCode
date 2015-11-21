public class Solution {
    /**
     * @param num: a rotated sorted array
     * @return: the minimum number in the array
     */
    public int findMin(int[] num) {
        // write your code here
        if(num.length == 0 || num == null){
        	return -1;
        }
        int start = 0;
        int end = num.length - 1;
        int target = num[num.length - 1];

        while(start + 1 < end){
        	int mid = start + (end - start) / 2;
        	if(target >= num[mid]){
        		end = mid;
        	} else {
        		start = mid;
        	}
        }

        if (num[start] <= target){
        	return num[start];
        } else {
        	return num[end];
        }
    }
}
