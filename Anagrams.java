public class Solution {
    /**
     * @param strs: A list of strings
     * @return: A list of strings
     */
    public List<String> anagrams(String[] strs) {
        // write your code here
        ArrayList<String> results = new ArrayList<String>();
        if(strs == null || strs.length < 2)
        	return results;

        HashMap<String,Integer> dict = new HashMap<String,Integer>();
        for(int i=0; i < strs.length;i++){
        	char[] temp = strs[i].toCharArray();
        	Arrays.sort(temp);
        	String cur = new String(temp);

        	if(dict.containsKey(cur)){
        		results.add(strs[i]);
        		
        		if(dict.get(cur) != -1){
        			int pre = dict.get(cur);
        			results.add(strs[pre]);
        			dict.put(cur,-1);
        		}
        	}else{
        		dict.put(cur,i);
        	}


        }
        return results;

    }
}
