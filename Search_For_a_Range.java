public class Solution {
    /** 
     *@param A : an integer sorted array
     *@param target :  an integer to be inserted
     *return : a list of length 2, [index1, index2]
     */
    public int[] searchRange(int[] A, int target) {
        // write your code here
        if(A.length == 0 || A == null){
        	return new int[]{-1,-1};
        }
        int start = 0;
        int end = A.length - 1;
        int[] bound = new int[2];

        while(start + 1 < end){
        	int mid = start + (end - start) / 2;
        	if (A[mid] == target){
        		bound[0] = mid;
        	} else if(A[mid] > target) {
        		end = mid;
        	} else {
        		start = mid;
        	}
        }

        if(A[start] == target){
        	bound[0] = start;
        } else if(A[end] == target){
        	bound[0] = end;
        } else {
        	bound[0] = bound[1] = -1;
        	return bound;
        }

        int start = 0;
        int end = A.length - 1;

        while(start + 1 < end){
        	int mid = start + (end - start) / 2;
        	if (A[mid] == target){
        		bound[1] = mid;
        	} else if(A[mid] > target) {
        		end = mid;
        	} else {
        		start = mid;
        	}
        }

        if(A[end] == target){
        	bound[1] = end;
        } else if(A[start] == target){
        	bound[1] = start;
        } else {
        	bound[0] = bound[1] = -1;
        	return bound;
        }

        return bound;
    }
}

