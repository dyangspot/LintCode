/**
* Write a method anagram(s,t) to decide if two strings are anagrams or not.
* Have you met this question in a real interview? Yes
* Example
* Given s="abcd", t="dcab", return true.
* Challenge
* O(n) time, O(1) extra space
**/

public class Solution {
    /**
     * @param s: The first string
     * @param b: The second string
     * @return true or false
     */
    public boolean anagram(String s, String t) {
        // write your code here
        if(s == null || t == null || s.length() == 0 || t.length() == 0 || s.length() != t.length())
        	return false;
        int[] ss = new int[256];
        int[] tt = new int[256];

        for(int i=0; i < s.length();s++){
        	ss[s.charAt(i)]++;
        	tt[t.charAt(i)]++;
        }

        for(int j=0;j < 256; j++){
        	if(ss[j] != tt[j]) return false;
        }

        return true;
    }
};
