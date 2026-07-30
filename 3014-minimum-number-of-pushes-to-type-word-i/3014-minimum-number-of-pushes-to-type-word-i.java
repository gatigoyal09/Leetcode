class Solution {
    public int minimumPushes(String word) {
        int ans = 0;
        int len = word.length();
        int i = 1;
        while (len > 7) {
            ans += i * (8);
            len -= 8;
            i++;
        }
        ans += i * len;
        return ans;
    }
}