class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int ans = 0;
        Map<String, Integer> mpp = new HashMap<>();
        for(int i=0; i<n; i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<n; j++){
                sb.append(grid[i][j]);
                sb.append("-");
            }
            String str = sb.toString();
            mpp.put(str, mpp.getOrDefault(str, 0)+1);
        }
        for(int i=0; i<n; i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<n; j++){
                sb.append(grid[j][i]);
                sb.append("-");
            }
            String str = sb.toString();
            if(mpp.containsKey(str)) ans += mpp.get(str);
        }
        return ans;
    }
}