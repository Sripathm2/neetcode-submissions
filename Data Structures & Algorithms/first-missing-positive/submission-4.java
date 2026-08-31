class Solution {
    public int firstMissingPositive(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i] < 0){
                nums[i] = 0;
            }
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0) {
                continue;
            }

            int value = Math.abs(nums[i]);
            int value_to_use = value - 1;
            if(value_to_use < nums.length){
                if(nums[value_to_use] == 0)
                    nums[value_to_use] = 1;
                if(nums[value_to_use] > 0)
                    nums[value_to_use] *= -1;
            }
        }
        

        for(int i=0;i<nums.length;i++){
            if(nums[i] >= 0){
                return i+1;
            }
        }
        return nums.length+1;

    }
}