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
    public static boolean Helper(TreeNode p,TreeNode q){
        if(p==null || q==null){
            return p==q;
        }
        boolean left = Helper(p.left,q.right);
        boolean right = Helper(p.right,q.left);
        return (left && right && p.val==q.val);
    }

    public boolean isSymmetric(TreeNode root) {
        return Helper(root.left,root.right);
    }
}