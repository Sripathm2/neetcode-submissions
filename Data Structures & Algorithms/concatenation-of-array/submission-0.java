class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] new_nums = new int[nums.length*2];
        int i=0;
        for(int num:nums){
            new_nums[i] = num;
            new_nums[i+nums.length] = num;
            i += 1;
        }
        return new_nums;
    }
}