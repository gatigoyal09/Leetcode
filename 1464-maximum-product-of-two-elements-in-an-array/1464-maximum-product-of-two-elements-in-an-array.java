class Solution {
    public int maxProduct(int[] nums) {
        // int maxi = Integer.MIN_VALUE;
        int n = nums.length;
        // for(int i=0; i<n; i++){
        //     for(int j=i+1; j<n; j++){
        //         maxi = Math.max(maxi, (nums[i]-1)*(nums[j]-1));
        //     }
        // }
        // return maxi;
        Arrays.sort(nums);
        return (nums[n-1]-1)*(nums[n-2]-1);
    }
}