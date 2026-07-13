class Solution {
    public int dep(TreeNode root){
        if(root == null) return 0;
        return 1+Math.max(dep(root.left), dep(root.right));
    }
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return dep(root);
    }
}