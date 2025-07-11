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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> mpp = new HashMap<>();
        for (int i=0; i<inorder.length; i++){
            mpp.put(inorder[i], i);
        }
        TreeNode root = buildTree(preorder, 0, preorder.length-1,inorder, 0,inorder.length-1, mpp);
        // (preorder array, preorder starting pt, preorder end pt..)
        return root;
    }
    public TreeNode buildTree(int[]preorder, int preStart, int preEnd, int[]inorder, int inStart, int inEnd, Map<Integer, Integer>mpp){
        if (preStart > preEnd || inStart > inEnd){
            return null;
        }
        TreeNode root = new TreeNode(preorder[preStart]); // root = preorder ka 1st;
        int inRoot = mpp.get(root.val); //inorder ka root = root.val (3) ka index = 1;
        int numsLeft = inRoot - inStart; // numbers in the left of root of inorder (1-0);
        // only one no. is left in the right side

        root.left = buildTree(preorder, preStart +1, preStart + numsLeft, inorder, inStart, inRoot -1, mpp);
    
        root.right = buildTree(preorder, preStart + numsLeft +1, preEnd, inorder, inRoot +1, inEnd, mpp);

// defining left & right side of the root for both preorder and inorder
        return root;
    }
}
