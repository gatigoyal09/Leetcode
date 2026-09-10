class Solution {
    // public void avg(TreeNode root, int sum, int cnt){
    //     if(root == null){
            
    //     }
    //     sum += root.val;
    //     cnt++;
    //     avg(root.left, sum, cnt);
    //     avg(root.right, sum, cnt);
    // }

    class Pair{
        int sum;
        int cnt;
        public Pair(int sum, int cnt){
            this.sum = sum;
            this.cnt = cnt;
        }
    }

    static int ans ;
    public void check( TreeNode root, Pair p){
        
        if( root == null) return;
        p.sum += root.val;
        p.cnt++;
        check(root.left,p);
        check( root.right, p);

    }

    public void trav( TreeNode root ){
        if( root == null) return;
        Pair p = new Pair(0,0);
        check( root,p);
        if( p.sum / p.cnt == root.val) ans++;

        trav( root.left);
        trav( root.right);

    }


    public int averageOfSubtree(TreeNode root) {
        ans = 0;
        trav(root);
        return ans;
    }
}