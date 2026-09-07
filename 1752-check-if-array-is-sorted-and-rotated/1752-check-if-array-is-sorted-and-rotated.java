class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int i = 0;
        while(i<n-1 && nums[i]<=nums[i+1]){
            i++;
        }
        i++;
        int maxi = 0;
        for(int j=i; j<n; j++){
            if(nums[j]<maxi) return false;
            maxi = nums[j];
        }
        for(int j=0; j<i;j++){
            if(nums[j]<maxi) return false;
            maxi = nums[j];
        }
        return true;
    }
}