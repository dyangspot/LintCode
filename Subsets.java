class Solution {
    /**
     * @param S: A set of numbers.
     * @return: A list of lists. All valid subsets.
     */
    public ArrayList<ArrayList<Integer>> subsets(int[] nums) {
        // write your code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(nums == null || nums.length == 0){
        	return result;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.sort(nums);

        subsetHelper(result,);	

        return result;
    }

    private void subsetHelper(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list,int[] num, int pos){
    	result.add(new ArrayList<Integer>(list));

    	for(int i=pos;i < num.length;i++){
    		list.add(num[i]);
    		subsetHelper(result,list,num,i+1);
    		list.remove(list.size() - 1);
    	}
    }
}
