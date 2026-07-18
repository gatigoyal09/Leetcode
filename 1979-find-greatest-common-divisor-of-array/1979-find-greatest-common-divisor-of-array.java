class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length;
        int min = nums[0];
        int max = nums[0];
        for(int el : nums){
            if(el > max) max = el;
            if(el < min) min = el;
        }
        while(min!=0){
            int temp = min;
            min = max % min;
            max = temp;
        }
        return Math.abs(max);
    }
}