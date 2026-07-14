class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = 0;
        int n = nums.length;
        if (n == 1)
            return 0;
        int i=0; 
        int j=n-1;
        while(i<j){
            if(nums[i]+nums[j]==k){
                ans++;
                i++;
                j--;
            }
            else if(nums[i]+nums[j]>k) j--;
            else i++;
        }
        return ans;
        // Map<Integer, Integer> mpp = new HashMap<>();
        // for(int el : nums){
        //     mpp.put(el, mpp.getOrDefault(el,0)+1);
        // }
        // for(int key : mpp.keySet()){
        //     int cnt1 = mpp.get(key);
        //     if(mpp.containsKey(k - key)){
        //         ans += Math.min(cnt1, mpp.get(k-key));
        //     }
        // }
        
        // return ans/2;
    }
}