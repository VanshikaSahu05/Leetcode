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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            TreeNode node = new TreeNode(val);
            return node;
        }
        TreeNode temp = root;
        while (true) {
            if (root.val > val) {
                if (root.left == null) {
                    TreeNode node = new TreeNode(val);
                    root.left = node;
                    break;
                }
                root = root.left;
            }
            else{
                if (root.right == null) {
                    TreeNode node = new TreeNode(val);
                    root.right = node;
                    break;
                }
                root = root.right;
            }
        }
        return temp;
    }
}