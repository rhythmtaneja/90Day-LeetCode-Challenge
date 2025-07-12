class Solution {
    public int getLeftHeight(TreeNode root) {
        TreeNode temp = root;
        int h = 0;

        while (temp != null) {
            temp = temp.left;
            h++;
        }
        return h;
    }

    public int getRightHeight(TreeNode root) {
        TreeNode temp = root;
        int h = 0;

        while (temp != null) {
            temp = temp.right;
            h++;
        }
        return h;
    }

    public int countNodes(TreeNode root) {
        if (root == null) return 0;

        int lh = getLeftHeight(root);
        int rh = getRightHeight(root);

        if (lh == rh) return (int)Math.pow(2, lh) - 1;

        return countNodes(root.left) + countNodes(root.right) + 1;
    }
}
