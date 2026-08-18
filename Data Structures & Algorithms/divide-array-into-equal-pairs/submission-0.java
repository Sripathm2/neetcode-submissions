class Solution {
    public boolean divideArray(int[] nums) {
        if(nums.length%2 == 1)
            return false;
        
        int count[] = new int[501];
        for(int num:nums){
            count[num] += 1;
        }

        for(int cnt:count){
            if(cnt != 0 && cnt%2 == 1){
                return false;
            }
        }
        return true;
    }
}