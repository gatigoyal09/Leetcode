class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int ans = 0;
        
        for(int i=0; i<nums.length; i++){
            long pf = 0;
            for(int j=i; j<nums.length; j++){
                pf += nums[j];
                long last = pf % 10;
                if(last != x) continue;
                long first = pf;
                while(first > 9){
                    first /= 10;
                }
                if(first == x && last == x) ans++;
            }
        }
        return ans;
    }
}