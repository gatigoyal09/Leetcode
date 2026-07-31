class Solution {
    public int minimumPushes(String word) {
        int[] arr = new int[26];
        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            arr[ch - 'a']++;
        }
        Arrays.sort(arr);
        int ans = 0;
        int push = 1;
        int cnt = 0;
        for(int i=25; i>=0 && arr[i]>0; i--){
            ans += arr[i]*push;
            cnt++;
            if(cnt%8==0) push++;
        }
        return ans;
    }
}