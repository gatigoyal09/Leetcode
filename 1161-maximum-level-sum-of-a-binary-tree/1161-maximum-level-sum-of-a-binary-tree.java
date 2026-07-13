class Solution {
    public int maxLevelSum(TreeNode root) {
        
        int ans = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int maxi = Integer.MIN_VALUE;
        int lvl = 0;
        while(!q.isEmpty()){
            lvl++;
            int size = q.size();
            int sum = 0;
            for(int i=0; i<size; i++){
                TreeNode temp = q.remove();
                sum += temp.val;
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);

            }
            if(sum > maxi){
                maxi = sum;
                ans = lvl;
            }
        }
        return ans;
    }
}