class Solution {
    public int reverse(int x) {
        int n = Math.abs(x);
        long ans = 0;
        while(n!=0){
            ans = ans*10 + n%10;
            n = n/10;
        }
        if(ans>Integer.MAX_VALUE || ans<Integer.MIN_VALUE) return 0;
        else return x>0 ? (int)ans : (int)((-1)*ans);
    }
}