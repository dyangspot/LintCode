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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if (root == null) {
        	return result;
        }
        queue.offer(root);
        while(!stack.empty()) {
        	List<Integer> level = new ArrayList<Integer>();
        	int size = queue.size();
        	for(int i = 0; i < size; i++) {
        		TreeNode head = queue.poll();
        		level.add(head.val);
        		if (head.left != null) {
        			stack.push(head.left);
	        	}
        		if (head.right != null) {
	        		stack.push(head.right);
	        	}
        		
	        	
    		}

    		result.add(level);

        }
        return result;
    }
}