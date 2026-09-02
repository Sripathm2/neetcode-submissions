class Solution {
    public int arraySign(int[] nums) {
        int neg = 0;
        for(int num:nums){
            if(num == 0)
                return 0;
            if(num < 0){
                neg += 1;
            }
        }
        int val = 1;
        if(neg%2==1)
            val = -1;
        return val;
    }
}