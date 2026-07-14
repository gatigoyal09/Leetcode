class Solution {
    public int maxArea(int[] height) {
        int ans = Integer.MIN_VALUE;
        int i=0, j=height.length-1;
        while(i<j){
            int water = (j - i) * Math.min(height[i], height[j]);
            ans = Math.max(ans, water);
            if(height[i]>=height[j]) j--;
            else i++;
        }
        return ans;
    }
}