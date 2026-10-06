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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> q1 = new LinkedList<TreeNode>();
        Queue<TreeNode> q2 = new LinkedList<TreeNode>();
        q1.add(p);
        q2.add(q);
    
        while(!q1.isEmpty() && !q2.isEmpty())
        {
            TreeNode currentNode1 = q1.poll();
            TreeNode currentNode2 = q2.poll();

            if(currentNode1 == null && currentNode2 == null)
            {
                continue;
            }
            if(currentNode1 == null || currentNode2 == null)
            {
                return false;
            }
            if(currentNode1.val != currentNode2.val)
            {
                return false;
            }
            q1.add(currentNode1.left);
            q1.add(currentNode1.right);
            q2.add(currentNode2.left);
            q2.add(currentNode2.right);

            
        }
        return q1.isEmpty() && q2.isEmpty();

        
    }
}
