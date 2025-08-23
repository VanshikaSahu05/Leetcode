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
    public static void helper(TreeNode root,ArrayList<Integer> ls){
        if(root == null){
            return;
        }
        helper(root.left,ls);
        ls.add(root.val);
        helper(root.right,ls);

    }
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> ls = new ArrayList<>();
        helper(root,ls);
        for(int i=0;i<ls.size()-1;i++){
            for(int j=i+1;j<ls.size();j++){
                if(ls.get(i)+ls.get(j)==k) return true;
            }
        }
        return false;
    }
}