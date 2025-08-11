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
    public static boolean isLeaf(TreeNode node){
       return (node.left == null && node.right == null);
    }
    public static void Helper(TreeNode root,ArrayList<String> ans,StringBuilder st ){
        if(root == null){
            return;
        }
        int len = st.length();
        st.append(root.val);
        if(isLeaf(root)){
            ans.add(st.toString());
        }
        else{
            st.append("->");
        Helper(root.left,ans,st);
        Helper(root.right,ans,st);
        }
        st.setLength(len);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> ans = new ArrayList<>();
        StringBuilder st = new StringBuilder();
        // String str = new ArrayList<>();
        Helper(root,ans,st);
        return ans;
    }
}