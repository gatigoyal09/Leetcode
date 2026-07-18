class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        while(nums[n-1]!=0){
            int temp = nums[n-1];
            nums[n-1] = nums[0] % nums[n-1];
            nums[0] = temp;
        }
        return Math.abs(nums[0]);
    }
}