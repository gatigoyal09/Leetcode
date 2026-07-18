class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int el : nums) sum += el;
        int pf = 0;
        for(int i=0; i<nums.length; i++){
            if(pf == (sum - pf - nums[i])) return i;
            pf += nums[i];
        }
        return -1;
    }
}