public class Solution {
    /**
     * @param A: Given an integers array A
     * @return: A Long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
     */
    public ArrayList<Long> productExcludeItself(ArrayList<Integer> A) {
        // write your code
        ArrayList<Long> results = new ArrayList<Long>();
        int size = A.size();
        for(int i=0; i < size; i++){
        	long product = 1;
			for(int j=0;j < size;j++){
				if(i != j){
					product	= product * A.get(j);
				}
			}        	
			results.add(product);

        }
        return results;
    }
}

