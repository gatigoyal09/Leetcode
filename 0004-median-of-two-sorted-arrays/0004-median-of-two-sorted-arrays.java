class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int i = 0, j = 0, k=0;
        int[] ans = new int[m+n];

        while(i<m && j<n){
            if(nums1[i]>=nums2[j]){
                ans[k] = nums2[j];
                j++;
            } else {
                ans[k] = nums1[i];
                i++;
            }
            k++;
        }
        if(j>=n){
            while(i<m){
                ans[k] = nums1[i];
                i++; 
                k++;
            }
        } 
        if(i>=m) {
            while(j<n){
                ans[k] = nums2[j];
                j++; 
                k++;
            }
        }
        double res = 0;
        if((m+n)%2==0) 
        res = (ans[(m+n)/2] + ans[(m+n)/2 - 1])/2.0 ;
        else  res = ans[(m+n)/2];
        return res;
    }
}