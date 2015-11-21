/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if (root == null) {
        	return result;
        TreeNode current = root;
        while(current != null || !stack.empty()) {
        	while (current != null) {
        		stack.add(current);
        		current = current.left;
        	}
        	current = stack.pop();
        	result.add(current.val);
        	current = current.right;
        }
        return result;
    }
}
