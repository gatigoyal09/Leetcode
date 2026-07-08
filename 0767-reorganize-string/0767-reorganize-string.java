class Solution {
    class Pair implements Comparable<Pair> {
        int a;
        char b;

        public Pair(int a, char b) {
            this.a = a;
            this.b = b;
        }

        public int compareTo(Pair p) {
            return p.a - this.a;
        }
    }

    public String reorganizeString(String s) {
        int n = s.length();
        Map<Character, Integer> mpp = new HashMap<>();
        for (char ch : s.toCharArray()) {
            mpp.put(ch, mpp.getOrDefault(ch, 0) + 1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (char ch : mpp.keySet()) {
            pq.offer(new Pair(mpp.get(ch), ch));
        }
        if (n % 2 == 0 && pq.peek().a > n / 2)
            return "";
        else if(n%2!=0 && pq.peek().a > n / 2 + 1) return "";
        StringBuilder sb = new StringBuilder(s);
        
        int i = 0;
        int j = 1;
        while (!pq.isEmpty()) {
            Pair p = pq.poll();
            char ch = p.b;
            int freq = p.a;
            while (i < n && freq > 0) {
                sb.setCharAt(i, ch);
                freq--;
                i += 2;
            }
            if (i >= n) {
                while (j < n && freq > 0) {
                    sb.setCharAt(j, ch);
                    freq--;
                    j += 2;
                }
            }
        }
        // StringBuilder ans = new StringBuilder();
        // for(char ch : sb) ans.append(ch);
        return sb.toString();
    }
}