class Solution {
    public int longestSubarray(int[] nums) {
        int cnt = 0;
        int len = 0;
        int i=0;
        for(int j=0; j<nums.length; j++){
            if(nums[j]==0) cnt++;
            while(cnt > 1){
                if(nums[i]==0) cnt--;
                i++;
            }
            len = Math.max(len, j-i);
        }
        
        return len;
    }
}