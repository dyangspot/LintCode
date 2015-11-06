public class Solution {
    /**
     * @param nums: A list of integers
     * @return: A list of integers includes the index of the first number 
     *          and the index of the last number
     */
    public ArrayList<Integer> subarraySum(int[] nums) {
        // write your code here
        ArrayList<Integer> results = new ArrayList<Integer>();
        HashMap<Integer,Integer> dict = new HashMap<Integer,Integer>();
        int sum = 0;
        dict.put(0,-1);
        for(int i=0; i < nums.length;i++){
        	sum += nums[i];
        	if(dict.contains(sum)){
        		results.add(map.get(sum) + 1)
        		results.add(i);

        	}
        	dict.put(sum,i);	

        }

        return results;
    }
}
