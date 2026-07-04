class Solution {
    public int furthestBuilding(int[] h, int b, int l) {
        int i = 0;
        int n = h.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        while(i < n-1){
            if(h[i]>=h[i+1]){
                i++;
                continue;
            }
            
            pq.offer(h[i+1]-h[i]);
            if(pq.size()>l) b -= pq.poll();
            if(b<0) return i;
            i++;
        }
        return n-1;
    }
}