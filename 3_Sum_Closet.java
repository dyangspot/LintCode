public class Solution {
    /**
     * @param numbers: Give an array numbers of n integer
     * @param target : An integer
     * @return : return the sum of the three integers, the sum closest target.
     */
    public int threeSumClosest(int[] numbers ,int target) {
        // write your code here
        if(numbers == null || numbers.length < 3){
        	return Integer.MAX_VALUE;
        }

        Arrays.sort(numbers);
        int closet = Integer.MAX_VALUE / 2;
        for(int i=0;i < numbers.length - 2;i++){
        	int left = i + 1;
        	int right = numbers.length - 1;
        	while(left < right){
        		int sum = numbers[i] + numbers[left] + numbers[right];

        		if(sum == closet){
        			return sum;
        		}else if(sum < closet){
        			left++;

        		}else{
        			right--;
        		}	
        		closet = Math.abs(sum - target) < Math.abs(closet - target) ? sum : closet;
        	}

        }
        return closet;

    }
}
