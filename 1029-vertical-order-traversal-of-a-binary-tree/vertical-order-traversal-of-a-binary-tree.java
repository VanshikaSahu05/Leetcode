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
class Tuple {
    TreeNode node;
    int vertical;
    int level;

    public Tuple(TreeNode node, int vertical, int level) {
        this.node = node;
        this.vertical = vertical;
        this.level = level;
    }
}

class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        // phle queue define karenge jo (node,vertical,level) ko store karega 
        Queue<Tuple> qe = new LinkedList<>();
        // fir ik TreeMap lenge jo vertical,level,node ko store karega priorityQueue for stored order
        TreeMap<Integer , TreeMap<Integer,PriorityQueue<Integer>>> map = new TreeMap<>();
        qe.offer(new Tuple(root,0,0));
        while(!qe.isEmpty()){
            Tuple tuple = qe.poll();
            TreeNode n=tuple.node;
            int x = tuple.vertical;
            int y = tuple.level;

            if(!map.containsKey(x)){
                map.put(x,new TreeMap<>());
            }
            if(!map.get(x).containsKey(y)){
                map.get(x).put(y,new PriorityQueue<>());
            }
            map.get(x).get(y).offer(n.val);
            if(n.left!=null){
                qe.offer(new Tuple(n.left,x-1,y+1));
            }
            if(n.right!=null){
                qe.offer(new Tuple(n.right,x+1,y+1));
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(TreeMap<Integer,PriorityQueue<Integer>> ys: map.values()){
            List<Integer> ls = new ArrayList<>();
            for(PriorityQueue<Integer> nodes : ys.values()){
                while(!nodes.isEmpty()){
                    ls.add(nodes.poll());
                }
            }
            ans.add(ls);
        }
return ans;
    }
}