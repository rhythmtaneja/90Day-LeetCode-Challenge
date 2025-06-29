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
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null){
            return wrapList;
        }
        queue.offer(root);
        while (!queue.isEmpty()){
            // root element in queue
        int numSize = queue.size();
        // take size of inserted elements and traverse through it
        List<Integer> subList = new LinkedList<Integer>();
        for (int i = 0; i<numSize; i++){
            if (queue.peek().left != null) queue.offer(queue.peek().left);
            if (queue.peek().right != null) queue.offer(queue.peek().right);
            subList.add(queue.poll().val);
        }
        wrapList.add(subList);
        }
        return wrapList;
    }
}
