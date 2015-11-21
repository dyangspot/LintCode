public class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> results = new ArrayList<List<Integer>>();
        if(nums.length == 0 || nums == null){
            return results;
        }

        int n = nums.length;
        Arrays.sort(nums);

        for(int i=0; i< (1 << n); i++){
            List<Integer> subset = new ArrayList<Integer>();
            for(int j = 0; j < n;j++){
                if(i & (1 << j)) != 0){
                    subset.add(nums[j])
                }
            }
            results.add(subset);
        }




      return results;
}