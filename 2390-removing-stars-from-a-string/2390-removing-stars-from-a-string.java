class Solution {
    public String removeStars(String s) {
        char[] ch = s.toCharArray();
        Stack<Character> st = new Stack<>();
        for(int i=0; i<ch.length; i++){
            if(ch[i]=='*'){
                st.pop();
            }
            else st.push(ch[i]);
        }
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        ans.reverse();
        return ans.toString();

    }
}