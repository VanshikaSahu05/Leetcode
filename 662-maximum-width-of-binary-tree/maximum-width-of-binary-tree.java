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
class Pair {
    TreeNode node;
    int index;

    Pair(TreeNode node, int index) {
        this.node = node;
        this.index = index;
    }

}

class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        int max = Integer.MIN_VALUE;;
        while (!q.isEmpty()) {
            int size = q.size();
            int firstIdx = -1;
            int secIdx = -1;

            for (int i = 0; i < size; i++) {
                Pair p = q.poll();
                if (i == 0) {
                    firstIdx = p.index;
                }
                if (i == size-1) {
                    secIdx = p.index;
                }
                if(p.node.left!=null){
                    q.add(new Pair(p.node.left,(2*p.index)+1));
                }
                if(p.node.right!=null){
                    q.add(new Pair(p.node.right,(2*p.index)+2));
                }
            }
            max = Math.max(max,secIdx-firstIdx+1);
        }
        return max;
    }
}