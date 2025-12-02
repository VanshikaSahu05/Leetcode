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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> qe = new LinkedList<>();
        if(root == null){
            return ans;
        }
        qe.add(root);
        boolean rightToLeft = false;
        while(!qe.isEmpty()){
            int size = qe.size();
            ArrayList<Integer> ls = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node = qe.remove();
                if(node.left!=null){
                    qe.add(node.left);
                }
                if(node.right!=null){
                    qe.add(node.right);
                }
                ls.add(node.val);
            }
            if(rightToLeft){
                Collections.reverse(ls);
                rightToLeft = false;
            }
            else{
                rightToLeft = true;
            }
            ans.add(ls);
        }
        return ans;
    }
}