class Solution {
    public int maxVowels(String s, int k) {
        int maxi = 0;
        int cnt = 0;
        int n = s.length();
        for (int i = 0; i < k; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                cnt++;
        }
        maxi = cnt;
        for (int i = k; i < n; i++) {
            if("aeiou".indexOf(s.charAt(i-k)) != -1) cnt--;
            if("aeiou".indexOf(s.charAt(i)) != -1) cnt++;
            maxi = Math.max(maxi , cnt);
        }
        return maxi;
    }
}