class Solution {
    public int arrangeCoins(int n) {
        if(n==1){
            return 1;
        }
        int count = 0;
        while(n > 0){
            n -= count; 
            count += 1;
        }
        
        return count-2; 
    }
}