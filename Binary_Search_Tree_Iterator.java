/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
// 中序遍历实现
public class BSTIterator {
    Stack<TreeNode> stack = new Stack<>();
    TreeNode current;

    public BSTIterator(TreeNode root) {
        this.current = root;
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return (current != null || !stack.empty());
    }

    /** @return the next smallest number */
    public int next() {
        while (current != null) {
            stack.push(current);
            current = current.left;
        }
        current = stack.pop();
        TreeNode node = current;
        current = current.right;
        return node.val;
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */