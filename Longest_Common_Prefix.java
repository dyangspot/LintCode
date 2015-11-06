public class Solution {
    /**
     * @param strs: A list of strings
     * @return: The longest common prefix
     */
    public String longestCommonPrefix(String[] strs) {
        // write your code here
        if(strs.length == 0 || strs == null ){
            return "";
        }
        String prefix = strs[0];
        for(int i=1; i < strs.length;i++){
            int j = 0;
            while(j < prefix.length() &&
                  j < strs[i].length() &&
                  strs[i].charAt(j) == prefix.charAt(j)){
                      j++;
                  }
            if( j == 0){
                return "";
            }      
            prefix = prefix.substring(0,j);
        }
        return prefix;
    }
}
