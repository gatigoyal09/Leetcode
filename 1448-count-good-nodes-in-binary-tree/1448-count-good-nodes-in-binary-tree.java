class Solution {
    public void help(TreeNode root, int[] ans, int maxi){
        if(root==null) return;
        maxi = Math.max(maxi, root.val);
        if(root.val >= maxi){
            ans[0]++;
        }
        help(root.left, ans, maxi);
        help(root.right, ans, maxi);
    }
    public int goodNodes(TreeNode root) {
        int[] ans = new int[1];
        ans[0] = 0;
        help(root, ans, root.val);
        return ans[0];
    }
}