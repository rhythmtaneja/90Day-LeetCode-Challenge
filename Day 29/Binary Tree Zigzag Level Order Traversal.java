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
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        if (root==null){
            return result;
        }
        q.offer(root);
        boolean leftToRight = true;
        while (!q.isEmpty()){
            int size = q.size();
            List<Integer> li = new ArrayList<>();
            for (int i = 0; i<size; i++){
            TreeNode node = q.poll();
              if (leftToRight){
                li.add(node.val);
              } else{
                li.add(0, node.val);
              }
            
            if (node.left!=null) q.offer(node.left);
            if (node.right != null ) q.offer(node.right);
                
            }
        leftToRight = !leftToRight;
        result.add(li);
        }
      return result;
    }
}
