class Solution {
    public void rec(int st, int lo, int hi, List<Integer> ans){
        if(st>9) return;
        int num = 0;
        for(int i=st; i<10; i++){
            if(num >= lo && num <= hi) ans.add(num);
            num *= 10;
            num += i;
        }
        if(num >= lo && num <= hi) ans.add(num);
        rec(st+1, lo, hi, ans);
    }
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        rec(1,low, high, ans);
        Collections.sort(ans);
        return ans;
    }
}