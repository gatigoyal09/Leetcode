class Solution {
    public int[] getAverages(int[] nums, int k) {
        int[] ans = new int[nums.length];
        if(2 * k + 1 > nums.length){
            Arrays.fill(ans, -1);
            return ans;
        }
        int n =  nums.length;
        long sum = 0;
        for(int i=0; i<(2*k+1); i++){
            sum += nums[i];
        }
        ans[k] = (int)(sum/(2*k+1));
        for(int i=0; i<k; i++) ans[i] = -1;
        for(int i=n-k; i<n; i++) ans[i] = -1;
        for(int i=k+1; i<n-k; i++){
            sum -= nums[i-k-1];
            sum += nums[i+k];
            ans[i] = (int)(sum / (2*k+1));
        }
        return ans;
    }
}