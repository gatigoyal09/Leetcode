class Solution {
    public TreeNode iop(TreeNode root){
        TreeNode temp = root.left;
        while(temp.right!=null) temp = temp.right;
        return temp;
    }
    public TreeNode parent(TreeNode root, TreeNode pred){
        if(root.right == pred || root.left == pred) return root;
        TreeNode temp = root.left;
        while(temp.right!=pred) temp = temp.right;
        return temp;
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if(root.val == key){
            // 0 child
            if(root.left==null && root.right == null){
                return null;
            }
            // 1 child
            else if(root.left==null || root.right==null){
                if(root.left!=null){
                    return root.left;
                } else return root.right;
            }
            // 2 children
            else{
                TreeNode pred = iop(root);
                TreeNode pp = parent(root, pred);
                if(root==pp){
                    pred.right = root.right;
                    return pred;
                }
                pp.right = pred.left; 
                pred.right = root.right; pred.left = root.left;
                return pred;
            }
        } else if(root.val > key){
            root.left = deleteNode(root.left, key);
        }
        else {
            root.right = deleteNode(root.right, key);
        }
        return root;
        
    }
}