class Solution {
    public int maxDepth(TreeNode root) {
        // base case
        if (root == null) return 0;

        // recursive case
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return 1 + Math.max(left, right);
    }
}