class Solution {
    public int maxProduct(int n) {
        int maxi = 0;
        int smaxi = 0;
        int num = n;
        while(num>0){
            int dig = num % 10;
            if(dig > maxi){
                smaxi = maxi;
                maxi = dig;
            } else if(dig > smaxi){
                smaxi = dig;
            }
            num = num / 10;
            
        }
        return maxi * smaxi;
    }
}