class Solution {
    private void getPath(TreeNode root, String path, List<String> answer){
        if (root.left == null && root.right == null) answer.add(path + root.val);
        if (root.left != null) getPath(root.left, path + root.val + "->", answer);
        // left traversal basically
        if (root.right != null) getPath(root.right, path + root.val + "->", answer);
        //right traversal
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> answer = new ArrayList<String>();
        if (root != null) getPath(root, "", answer);
        return answer;
    }
}
