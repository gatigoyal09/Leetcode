class Solution {
    public String removeDuplicateLetters(String s) {
        int n = s.length();
        Map<Character, Integer> mpp = new HashMap<>();
        for(int i=0; i<n; i++){
            mpp.put(s.charAt(i), i);
        }
        int[] cnt = new int[26];
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0)); 
        cnt[s.charAt(0)-'a']=1;
        for(int i=1; i<n; i++){
            char ch = s.charAt(i);
            if(cnt[ch-'a']==1) continue;
            while(!st.isEmpty() && i < mpp.get(st.peek()) && ch < st.peek()){
                cnt[st.peek() - 'a'] = 0;
                st.pop();
            }
            st.push(ch); cnt[ch - 'a'] = 1;
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}