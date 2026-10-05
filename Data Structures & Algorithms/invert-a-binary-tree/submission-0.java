/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();

        if(root == null)
        {
            return null;
        }
        q.add(root);

        while(!q.isEmpty())
        {
            TreeNode currentNode = q.peek();
            q.remove();
            TreeNode temp = currentNode.left;
            currentNode.left = currentNode.right;
            currentNode.right = temp;

            if(currentNode.left != null)
            {
                q.add(currentNode.left);
            }
            if(currentNode.right != null)
            {
                q.add(currentNode.right);
            }
        }
        return root;
        
    }
}
