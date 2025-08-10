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
    public static void Helper(TreeNode root,int level,ArrayList<Integer> ls ){
        if(root==null){
            return;
        }
        if(level == ls.size()){
            ls.add(root.val);
        }
        Helper(root.right,level+1,ls);
        Helper(root.left,level+1,ls);
    }
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> ls = new ArrayList<>();
        Helper(root,0,ls);
        return ls;
    }
}