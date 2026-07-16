class Solution {
    public int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a);
    }
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] pgcd = new int[n];
        int mxi = nums[0];
        for(int i=0; i<n; i++){
            mxi = Math.max(mxi, nums[i]);
            pgcd[i] = gcd(nums[i], mxi);
        }
        Arrays.sort(pgcd);
        int i=0, j=n-1;
        long sum = 0;
        while(i<j){
            sum += gcd(pgcd[i], pgcd[j]);
            i++;
            j--;
        }
        return sum;
    }
}