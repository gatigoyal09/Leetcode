class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        if(len==1 && flowerbed[0]==0 && n<=1) return true;
        if(len==1 && flowerbed[0]==1 && n>0) return false;
        if(flowerbed[0]==0 && flowerbed[1]==0){
            flowerbed[0] = 1; n--;
        }  
        int i = 1;
        
        while(i<len-1){
            if(flowerbed[i]==0){
                if(flowerbed[i-1]!=1 && flowerbed[i+1]!=1){
                    flowerbed[i] = 1;
                    n--;
                }
            }
            i++;
        }
        if(flowerbed[len-1]==0 && flowerbed[len-2]==0) n--;
        return (n<=0) ? true : false;
    }
}