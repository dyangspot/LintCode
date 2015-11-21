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
	// non- recursive
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if (root == null) {
        	return result;
        }
        stack.push(root);
        while (!stack.empty()) {
        	TreeNode node = stack.pop();
        	result.add(node.val);
        	if (node.right != null) {
        		stack.push(node.right);
        	} 
        	if (node.left != null) {
        		stack.push(node.left);
        	}
        }

        return result;
    }
// recursive 

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        helper(root,result);
        return results;
    }

    private List<Integer> helper(TreeNode root,List<Integer> result){
        if (root == null) {
            return results;
        }
        result.add(root.val);
        List<Integer> helper(root.left,result);
        List<Integer> helper(root.right,result);
    }

    public class Solution {
        public ArrayList<Integer> preorderTraversal(TreeNode root) {
            List<TreeNode> list = new ArrayList<TreeNode>();
            // null or leaf 
            if (root == null) {
                return results;
            }

            // Divide
            ArrayList<Integer> left = preorderTraversal(root.left);
            ArrayList<Integer> right = preorderTraversal(root.right);

            // Conquer
            result.add(root.val);
            result.add(left);
            result.add(right);

            return result;
        }
    }


}