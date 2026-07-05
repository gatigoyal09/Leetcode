class Solution {
    class Pair{
        int score, ways; // score and ways
        public Pair(int score, int ways){
            this.score = score;
            this.ways = ways;
        }
    }
    public Pair help(int i, int j, List<String> board, Pair[][] dp){
        if(i<0 || j<0) return new Pair(-1, 0);
        if(board.get(i).charAt(j)=='X') return dp[i][j] = new Pair(-1, 0);
        if(i==0 && j==0) return dp[i][j] = new Pair(0, 1);
        if(dp[i][j]!=null) return dp[i][j];
        Pair up = new Pair(-1, 0);
        Pair left = new Pair(-1, 0);
        Pair dia = new Pair(-1, 0);

        if(i>0) up = help(i-1, j, board, dp);
        if(j>0) left = help(i, j-1, board, dp);
        if(i>0 && j>0) dia =  help(i-1, j-1, board, dp);
        int best = Math.max(up.score, Math.max(left.score,  dia.score));
        if(best==-1) return dp[i][j] = new Pair(-1, 0);
        int cnt = 0;
        if(up.score == best) cnt += up.ways;
        if(left.score == best) cnt += left.ways;
        if(dia.score == best) cnt += dia.ways;
        cnt = cnt % 1000000007;
        int val = (Character.isDigit(board.get(i).charAt(j))) ? board.get(i).charAt(j) - '0' : 0;
        return dp[i][j] = new Pair(best + val, cnt);

    }
    public int[] pathsWithMaxScore(List<String> board) {
        int n = board.size();
        Pair[][] dp = new Pair[n][n];
        int[] ans = new int[2];
        Pair p = help(n-1, n-1, board, dp);
        ans[0] = p.score;
        ans[1] = p.ways;
        if(ans[0]==-1) return new int[]{0,0};
        return ans;
    }
}