public class Solution {
    /*
     * @param numbers : An array of Integer
     * @param target : target = numbers[index1] + numbers[index2]
     * @return : [index1 + 1, index2 + 1] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
        // write your code here
        // if(numbers == null || numbers.length < 2){
        // 	return new int[];
        // }

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        ArrayList<Integer> array = new ArrayList<Integer>();
        for(int i=0; i < numbers.length;i++){
        	map.put(numbers[i],i);
        }

        for(int i=0;i < numbers.length;i++){
        	int des = target - numbers[i];
        	if(map.containsKey(des)){
        		array.add(i + 1);
        		array.add(map.get(des) + 1);
        	}
        }
        int[] result = new int[array.size()];
        for(int i=0;i < array.size();i++){
        	result[i] = array.get(i);
        }
        return result;
    }
}
