/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public static void inOrder(TreeNode root, HashMap<TreeNode, TreeNode> map) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            map.put(root.left, root);
        }
        inOrder(root.left, map);
        if (root.right != null) {
            map.put(root.right, root);
        }
        inOrder(root.right, map);
    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<TreeNode, TreeNode> hs = new HashMap<>();
        inOrder(root, hs);

        Queue<TreeNode> q = new LinkedList<>();
        q.add(target);
        Set<TreeNode> visited = new HashSet<>();
        visited.add(target);
        while (!q.isEmpty() && k-->0) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode n = q.poll();
                if (n.left != null && !visited.contains(n.left)) {
                    q.add(n.left);
                    visited.add(n.left);
                }
                if (n.right != null && !visited.contains(n.right)) {
                    q.add(n.right);
                    visited.add(n.right);
                }
                if (hs.containsKey(n) && !visited.contains(hs.get(n))){
                    q.add(hs.get(n));
                    visited.add(hs.get(n));
                }
                    }
                    
                }
                while(!q.isEmpty()){
                    ans.add(q.poll().val);
                }
                return ans;
            }
}