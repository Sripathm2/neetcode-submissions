class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0;
        while(i<flowerbed.length){
            if(flowerbed[i] == 0 && 
            (i==0 || flowerbed[i-1] == 0) && (i==flowerbed.length-1 || flowerbed[i+1] == 0))
            {
                flowerbed[i] = 1;
                n -= 1;
            }
            i+= 1;
        }
        if(n <= 0){
            return true;
        }else{
            return false;
        }
    }
}