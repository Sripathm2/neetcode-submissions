class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int cur_val = -1;
        for(int num:nums){
            if(num == cur_val){
                count += 1;
            }else{
                if(count == 0){
                    cur_val = num;
                    count = 1;
                }else{
                    count -= 1;
                }
            }
        }
        return cur_val;
    }
}