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

        return 1+Math.max(left,right);
    }
    public int maxDepth(TreeNode root) {
        return helper(root);
    }
}