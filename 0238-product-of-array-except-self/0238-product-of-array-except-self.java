class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int currpre = 1;
        for(int i=0; i<nums.length; i++){
            prefix[i] = currpre;
            currpre *= nums[i];
        }
        int currsuf = 1;
        for(int i=nums.length-1; i>=0; i--){
            suffix[i] = currsuf;
            currsuf *= nums[i];
        }
        for(int i=0; i<nums.length; i++){
            ans[i] = prefix[i]*suffix[i];
        }
        return ans;

    }
}