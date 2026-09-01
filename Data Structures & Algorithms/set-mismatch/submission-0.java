class Solution {
    public int[] findErrorNums(int[] nums) {
        int repeat = -1;
        int missing = -1;
        for(int i=0;i<nums.length;i++){
            int value = nums[i];
            if(value < 1)
                value *= -1;
            if(nums[value-1]<0)
                repeat = value;
            else
                nums[value-1] *= -1;
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]> 0)
                missing = i+1;
        }

        return new int[]{repeat, missing};
    }
}