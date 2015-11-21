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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if(root == null) {
        	return result;
        }
        // Divide and Conquer
        if (root != null) {
        	List<Integer> left = postorderTraversal(root.left);
        	result.addAll(left);
        	List<Integer> right = postorderTraversal(root.right);
        	result.addAll(right);
        	result.add(root.val);
        }
        return result;
    }
}

public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if (root == null) {
            return result;
        }
        stack.push(root);
        // prev-order then reverse output
        while (!stack.empty()) {
            TreeNode node = stack.pop();
            if (node != null) {
                result.add(node.val);
            }
            if (node.left != null) {
                stack.push(node.left);
            } 
            if (node.right != null) {
                stack.push(node.right);
            }

        }

        Colection.reverse(reverse);
        return result;
    }
}


