/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: True if this Binary tree is Balanced, or false.
     */

    public class ResultType {
    	public boolean isBalanced;
    	public int maxDepth;

    	public ResultType(isBalanced,maxDepth) {
    		this.isBalanced = isBalanced;
    		this.maxDepth = maxDepth;
    	}
    }

    public boolean isBalanced(TreeNode root) {
        // write your code here
        return helper(root).isBalanced;
    }

    private ResultType helper(TreeNode root) {
    	if (root == null) {
        	return new ResultType(true,0)
        }

        ResultType left = isBalanced(root.left);
        ResultType right = isBalanced(root.right);

        // subtree is not balanced
        if (!left.isBalanced || !right.isBalanced) {
        	return new ResultType(false, -1);
        }

        if (Math.abs(left.maxDepth - right.maxDepth) > 1) {
        	return new ResultType(false,-1);
        }

        return new ResultType(true, Math.max(left.maxDepth, right.maxDepth) + 1)
    }
}

public class Solution {
    /**
     * @param root: The root of binary tree.
     * @return: True if this Binary tree is Balanced, or false.
     */

    public boolean isBalanced(TreeNode root) {
        // write your code here
    	return helper(root) != -1;
    }

    private int helper(TreeNode root) {
    	if (root == null) {
    		return 0;
    	}
    	int left = helper(root.left);
    	int right = helper(root.right);
    	if (left != -1 && right != -1 && Math.abs(left - right) > 1) {
    		return -1;
    	}

    	return Math.max(left,right) + 1;

    }
}

