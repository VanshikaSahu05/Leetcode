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
        // List<List<Integer>> ls = new ArrayList<>();
        // Queue<TreeNode> qs = new LinkedList<>();
        // int flag = 0;
        // if(root==null){
        //     return ls;
        // }
        // qs.add(root);
        // while(!qs.isEmpty()){
        //     List<Integer> temp = new ArrayList<>();
        //     int size = qs.size();
        //     for(int i=0;i<size;i++){
        //         if(qs.peek().left!=null){
        //             qs.add(qs.peek().left);
        //         }
        //         if(qs.peek().right!=null){
        //             qs.add(qs.peek().right);
        //         }
        //         temp.add(qs.poll().val);
        //     }
        //     if(flag==0){
        //         ls.add(temp);
        //         flag=1;
        //     }
        //     else{
        //         Collections.reverse(temp);
        //         ls.add(temp);
        //         flag=0;
        //     }
        // }
        // return ls;

        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> qe = new LinkedList<>();
        int flag = 0;
        if(root == null){
            return ans;
        }
        qe.add(root);
        while(!qe.isEmpty()){
            int size = qe.size();
            ArrayList<Integer> ls = new ArrayList<>();
            for(int i=0;i<size;i++){
                if(qe.peek().left!=null){
                    qe.add(qe.peek().left);
                }
                if(qe.peek().right!=null){
                    qe.add(qe.peek().right);
                }
                ls.add(qe.poll().val);
            }
            if(flag==0){
                ans.add(ls);
                flag=1;
            }
            else{
                Collections.reverse(ls);
                ans.add(ls);
                flag=0;
            }
        }
        return ans;
    }
}