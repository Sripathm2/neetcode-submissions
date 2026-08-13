class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max_count = 0;
        int one_count = 0;

        for(int num:nums){
            if(num == 1){
                one_count += 1;
            } else {
                if(max_count < one_count){
                    max_count = one_count;
                }
                one_count = 0;
            }
        }
        if(max_count < one_count){
            max_count = one_count;
        }
        return max_count;
    }
}