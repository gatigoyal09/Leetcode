class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<candies.length; i++){
            pq.offer(candies[i]);
        }
        for(int i=0; i<candies.length; i++){
            int now = candies[i] + extraCandies;
            if(pq.peek() <= now) ans.add(true);
            else ans.add(false);
        }
        return ans;
    }
}