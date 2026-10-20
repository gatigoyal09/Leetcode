class Solution {
    class Pair{
        int a,b;
        public Pair(int a, int b){
            this.a = a;
            this.b = b;
        }
    }
    public void solve(int j, int k, int m, int n, char[][] board, Stack<Pair> st, int[][] vis){
        int[] drow = {-1,0,1,0};
        int[] dcol = {0,1,0,-1};
        boolean touch = false;
        if(j==0 || k==0 || j==m-1 || k==n-1){
            touch = true;
        }
        ArrayList<Pair> cells = new ArrayList<>();
        while(!st.isEmpty()){
            Pair p = st.pop();
            int x = p.a;
            int y = p.b;
            cells.add(p);
            for(int i=0; i<4; i++){
                int ro = x + drow[i];
                int co = y + dcol[i];
                if(ro>=0 && ro<m && co>=0 && co<n && vis[ro][co]==0 && board[ro][co]=='O'){
                    
                        vis[ro][co] = 1;
                        if(ro==0 || co == 0 || ro==m-1 || co==n-1){
                            touch = true;
                        }
                        st.push(new Pair(ro, co));
                    
                }
            }
        }
        if(!touch){
            for(Pair p : cells){
                board[p.a][p.b] = 'X';
            }
        }
    }
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        int[][] vis = new int[m][n];
        
        for(int j=0; j<m; j++){
            for(int k=0; k<n; k++){
                if(board[j][k]=='O' && vis[j][k]==0){
                    Stack<Pair> st = new Stack<>();
                    
                    st.push(new Pair(j,k));
                    vis[j][k] = 1;
                    solve(j,k,m,n,board, st, vis);
                } 
            }
        }
    }
}