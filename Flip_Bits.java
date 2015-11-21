class Solution {
    /**
     *@param a, b: Two integer
     *return: An integer
     */
    public static int bitSwapRequired(int a, int b) {
        // write your code here
        if (a == b){
        	return 0;
        }
        int bit = a ^ b;
        int count = 0;
        // integer has 32 bits
        int number = 32;
        while(number > 0) {
        	count += bit & 1;
        	bit = bit >> 1;
        	number--;
        }
        return count;

    }
};

