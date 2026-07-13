
class Solution {
    public void help(TreeNode root, List<Integer> ans){
        if(root==null) return;
        if(root.right==null && root.left==null){
            ans.add(root.val);
            return;
        }
        help(root.left, ans);
        help(root.right, ans);
        return;
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        
        List<Integer> t1 = new ArrayList<>();
        List<Integer> t2 = new ArrayList<>();
        help(root1, t1);
        help(root2, t2);
        if(t1.equals(t2)) return true;
        // if(t1.size()!=t2.size())  return false;
        // for(int i=0; i<t1.size(); i++){
        //     if(t1.get(i)!=t2.get(i)) return false;
        // }
        return false;
    }
}