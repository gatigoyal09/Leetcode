class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        for(int i=0; i<k; i++){
            sum += nums[i];
        }
        maxi = sum;
        for(int i=k; i<nums.length; i++){
            sum -= nums[i-k];
            sum += nums[i];
            maxi = Math.max(maxi, sum);
        }
        double ans = (double) maxi / k;
        return ans;
    }
}