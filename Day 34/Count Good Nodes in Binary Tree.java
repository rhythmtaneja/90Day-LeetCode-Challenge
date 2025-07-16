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
    public int goodNodes(TreeNode root) {
        return countGood(root, root.val);
    }
    
    public int countGood(TreeNode root, int currMax) {
        if (root == null) return 0;
        
        int ans = root.val >= currMax ? 1 : 0;
        currMax = Math.max(currMax, root.val);
        
        ans += countGood(root.left, currMax);
        ans += countGood(root.right, currMax);
        
        return ans;
    }
}
