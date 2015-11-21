class Solution {
    /**
     * @param x: An integer
     * @return: The sqrt of x
     */
    public int sqrt(int x) {
        // write your code here
        int start = 1;
        int end = x;
        while(start + 1 < x){
        	int mid = start + (end - start) / 2;
        	if(mid * mid <= x){
        		start = mid;	
        	}else{
        		end = mid;
        	}
        }

    }
    if(end * end <= x){
    	return (int) end;
    } else{
    	return (int) start;
    }
}
