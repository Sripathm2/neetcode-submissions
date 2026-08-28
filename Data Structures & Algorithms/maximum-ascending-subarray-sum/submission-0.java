class Solution {
    public int maxAscendingSum(int[] nums) {
        int max = 0;
        int curr_size = nums[0];
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] < nums[i+1]){
                curr_size += nums[i+1];
                System.out.println(curr_size);
            }
            else{
                if(max < curr_size){
                    max = curr_size;
                }
                curr_size = nums[i+1];
            }
        }
        if(max < curr_size){
            max = curr_size;
        }
        return max;
    }
}