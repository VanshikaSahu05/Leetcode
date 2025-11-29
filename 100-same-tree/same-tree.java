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
    public static boolean helper(TreeNode p,TreeNode q){

        if((p!=null && q==null) || (p==null && q!=null)){
            return false;

        }
        if(p == null && q == null) return true;
        boolean left = helper(p.left,q.left);
        boolean right = helper(p.right,q.right);

        return (left && right) && (p.val == q.val);
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
       return  helper(p,q);
    }
}