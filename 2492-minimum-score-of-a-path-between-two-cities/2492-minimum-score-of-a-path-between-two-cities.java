class Solution {
    class Pair{
        int a, b;
        public Pair(int a, int b){
            this.a = a;
            this.b = b;
        }
    }

    public int minScore(int n, int[][] roads) {
        List<List<Pair>> ed = new ArrayList<>();
        for(int i=0; i<=n; i++){
            ed.add(new ArrayList<>());
        }
        for(int[] e: roads){
            ed.get(e[0]).add(new Pair(e[1],e[2]));
            ed.get(e[1]).add(new Pair(e[0],e[2]));
        }
        int[] vis = new int[n+1];
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        vis[1] = 1;
        int ans = Integer.MAX_VALUE;
        while(!q.isEmpty()){
            int node = q.poll();
            for(Pair p : ed.get(node)){
                ans = Math.min(ans, p.b);

                if(vis[p.a]==0){
                    vis[p.a] = 1;
                    q.add(p.a);
                }
            }
        }
        return ans;
    }
}