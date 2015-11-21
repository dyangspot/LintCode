public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(nums.length == 0 || nums == null){
        	return result;
        }
        int[] visited = new int[nums.length];
        List<Integer> list = new ArrayList<Integer>();
        permuteHelper(result,list,nums,visited);
        return result;
    }

    private void permuteHelper(List<List<Integer>> result, List<Integer> list, int[] nums,int[] visited){
    	if(list.size() == nums.length){
    		result.add(new ArrayList<Integer>(list));
    		return;
    	}


    	for(int i = 0; i<nums.length; i++){
    		if(visited[i] == 1 || (i != 0 && nums[i] == nums[i-1] && visited[i-1] == 0)){
    			continue;
    		}
            visited[i] = 1;
    		list.add(nums[i]);
    		permuteHelper(result,list,nums,visited);
    		list.remove(list.size() - 1);
            visited[i] = 0;
    	}
    }
}