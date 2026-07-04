class Solution {
    // class prop implements Comparable<prop>{
    //     int a, d;
    //     public prop(int a, int d){
    //         this.a = a;
    //         this.d = d;
    //     }
    //     public int compareTo(prop p){
    //         if(this.a==p.a) return this.d - p.d; // defence ascending
    //         return p.a - this.a; // attack descending
    //     }
    // }
    public int numberOfWeakCharacters(int[][] properties) {
        Arrays.sort(properties, (a,b)-> {
            if(a[0] == b[0]) return a[1] - b[1];
            return b[0] - a[0];
        });
        int maxDef = 0;
        int ans = 0;
        for(int[] p : properties){
            if(p[1] < maxDef) ans++;
            else maxDef = p[1];
        }
        return ans;
    }
}