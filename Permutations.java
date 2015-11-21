public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(nums.length == 0 || nums == null){
        	return result;
        }
        List<Integer> list = new ArrayList<Integer>();
        permuteHelper(result,list,nums);
        return result;
    }

    private void permuteHelper(List<List<Integer>> result, List<Integer> list, int[] nums){

    }
}