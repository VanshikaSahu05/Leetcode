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
    public static void helper(HashMap<TreeNode,TreeNode> hs,TreeNode root, Queue<TreeNode> q,Set<TreeNode> st,int start){
        if(root == null){
            return;
        }
        if(root.val == start){
            q.add(root);
            st.add(root);
        }
        if(root.left!=null){
            hs.put(root.left,root);
        }
        helper(hs,root.left,q,st,start);
        if(root.right!=null){
            hs.put(root.right,root);
        }
        helper(hs,root.right,q,st,start);
    }
    public int amountOfTime(TreeNode root, int start) {
        Queue<TreeNode> q = new LinkedList<>();
        HashMap<TreeNode,TreeNode> hs = new HashMap<>();
        Set<TreeNode> st = new HashSet<>();
        helper(hs,root,q,st,start);
        int count=-1;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode n = q.poll();
                if(n.left!=null && !st.contains(n.left)){
                    q.add(n.left);
                    st.add(n.left);
                }
                if(n.right!=null && !st.contains(n.right)){
                    q.add(n.right);
                    st.add(n.right);
                }
                if(hs.containsKey(n) && !st.contains(hs.get(n))){
                    q.add(hs.get(n));
                    st.add(hs.get(n));
                }
            }
            count++;
        }
        return count;
    }
}