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
    public static int helper(TreeNode n){
        if(n == null){
            return 0;
        }
        int left =  helper(n.left);
        int right =  helper(n.right);

        if(Math.abs(left -right) > 1){
            return -1;
        }
        if(left == -1 || right == -1) return -1;
        return 1+Math.max(left,right);
    }
    public boolean isBalanced(TreeNode root) {
        int height = helper(root);
        if(height != -1) return true;
        return false;
    }
}