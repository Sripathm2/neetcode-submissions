class Solution {
    public int mySqrt(int x) {
        int low = 0;
        int high = x/2;
        int mid = -1;
        long sq  = 0;
        if(x == 1){
            return 1;
        }
        while(low<=high){
            mid = ((low+high)/2);
            sq = (long)mid * mid;
            if(sq == x){
                return mid;
            }if(sq > x){
                high = mid -1;
            }else{
                low = mid +1;
            }
        }
        if(sq > x){
            return mid - 1;
        }
        return mid;
    }
}