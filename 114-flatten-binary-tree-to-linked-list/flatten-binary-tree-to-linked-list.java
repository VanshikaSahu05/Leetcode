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
    public static void preOrder(TreeNode root,ArrayList<TreeNode> ls){
        if(root == null){
            return;
        }
        ls.add(root);
        preOrder(root.left,ls);
        preOrder(root.right,ls);
    }
    public void flatten(TreeNode root) {
        ArrayList<TreeNode> ls = new ArrayList<>();
        preOrder(root,ls);
        for(int i=0;i<ls.size()-1;i++){
            TreeNode cur = ls.get(i);
            TreeNode next = ls.get(i+1);
            cur.left = null;
            cur.right = next;
        }
       
    }
}