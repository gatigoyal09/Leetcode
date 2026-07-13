class Solution {
    public boolean existsinLST(TreeNode root, TreeNode a){
        if(a==root) return true;
        if(root==null) return false;
        return existsinLST(root.left, a) || existsinLST(root.right, a);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p==root || q==root) return root;
        if(existsinLST(root.left, p)==true && existsinLST(root.left,q)==true) return lowestCommonAncestor(root.left ,p, q);
        if(existsinLST(root.left, p)==false && existsinLST(root.left,q)==false) return lowestCommonAncestor(root.right ,p, q);
        else return root;
    }
}