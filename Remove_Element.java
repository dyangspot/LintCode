public class Solution {
    /** 
     *@param A: A list of integers
     *@param elem: An integer
     *@return: The new length after remove
     * 双指针， 一前一后， 如果A中元素 == elem,后面的值覆盖当前元素，后面指针-1
     * 
     */
    public int removeElement(int[] A, int elem) {
        // write your code here
        int i=0;
        int point = A.length - 1;
        while(i <= point){
        	if(A[i] == elem){
        		A[i] = A[point];
        		point--;
        	}else{
        		i++;
        	}
        }
        return point + 1;

    }
}
