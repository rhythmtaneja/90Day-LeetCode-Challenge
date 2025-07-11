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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Postorder(root , result);
        return result;
    }
    private void Postorder(TreeNode curr,List<Integer>result){
        if (curr == null){
            return;
        }
        Postorder(curr.left, result);
        Postorder(curr.right, result);
        result.add(curr.val);
    }
}
