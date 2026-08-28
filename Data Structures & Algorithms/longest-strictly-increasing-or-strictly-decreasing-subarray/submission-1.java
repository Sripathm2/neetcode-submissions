class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max = 0;
        int curr_size = 1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] < nums[i+1])
                curr_size += 1;
            else{
                if(max < curr_size){
                    max = curr_size;
                }
                curr_size = 1;
            }
        }
        if(max < curr_size){
            max = curr_size;
        }
        curr_size = 1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] > nums[i+1])
                curr_size += 1;
            else{
                if(max < curr_size){
                    max = curr_size;
                }
                curr_size = 1;
            }
        }
        if(max < curr_size){
            max = curr_size;
        }
        return max;
    }
}