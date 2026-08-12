class Solution {
    public int singleNumber(int[] nums) {
        int xorval = 0;
        for(int i=0;i<nums.length;i++){
            xorval ^= nums[i];
        }

        return xorval;
    }
}
