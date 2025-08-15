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
    public int idx = 0;
    public  TreeNode helper(int[] preorder, int[] inorder,int start,int end){
        if(start>end){
            return null;
        }
        int rootVal = preorder[idx];
        int a=-1;
        for(int i=start;i<=end;i++){
            if(inorder[i]==rootVal){
                a=i;
                break;
            }
        }
        idx++;
        TreeNode root = new TreeNode(rootVal);
        root.left = helper(preorder,inorder,start,a-1);
        root.right = helper(preorder,inorder,a+1,end);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        return helper(preorder,inorder,0,n-1);
    }
}