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
    public int height(TreeNode A)
    {
        if(A == null)
        {
            return 0;
        }
        int leftSubtreeHeight = height(A.left);
        if(leftSubtreeHeight == -1)
        {
            return -1;
        }
        int rightSubtreeHeight = height(A.right);
        if(rightSubtreeHeight == -1)
        {
            return -1;
        }
        if(Math.abs(leftSubtreeHeight - rightSubtreeHeight) > 1)
        {
            return -1;
        }
        return 1 + Math.max(leftSubtreeHeight,rightSubtreeHeight);
    }
    public boolean isBalanced(TreeNode root) {

        return height(root) != -1;
 
    }
}
