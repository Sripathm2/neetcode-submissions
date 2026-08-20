class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1){
            return true;
        }
        int low = 1;
        int high = num/2;
        while(low <= high){
            int mid = (low+high)/2;
            long sqrt = (long) mid * mid;
            System.out.println(mid + "   " + sqrt);
            if(sqrt == num){
                return true;
            }
            else if(sqrt > num){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return false;
    }
}