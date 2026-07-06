class Solution {
    class Interval implements Comparable<Interval>{
        int a, b;
        public Interval(int a, int b){
            this.a = a;
            this.b = b;
        }
        public int compareTo(Interval in){
            if(this.a == in.a) return in.b - this.b;
            return this.a - in.a;
        }
    }
    public int removeCoveredIntervals(int[][] intervals) {
        Interval[] arr = new Interval[intervals.length];
        for(int i=0; i<intervals.length; i++){
            arr[i] = new Interval(intervals[i][0], intervals[i][1]);
        }
        Arrays.sort(arr);
        int cnt = 0; 
        int maxEnds = 0;
        for(Interval curr : arr){
            if(curr.b <= maxEnds) cnt++;
            else maxEnds = curr.b;
        }
        return arr.length - cnt;
    }
}