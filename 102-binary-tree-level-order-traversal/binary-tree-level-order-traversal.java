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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> qe = new LinkedList<>();
        if(root == null){
            return ans;
        }
        qe.add(root);
        while(!qe.isEmpty()){
            int size = qe.size();
            ArrayList<Integer> ls = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode n = qe.remove();
                ls.add(n.val);
                if(n.left != null){
                    qe.add(n.left);
                }
                if(n.right != null){
                    qe.add(n.right);
                }
            }
            ans.add(ls);
        }
        return ans;
    }
}