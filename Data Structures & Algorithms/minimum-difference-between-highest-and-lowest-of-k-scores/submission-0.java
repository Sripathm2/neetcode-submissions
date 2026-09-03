class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min = nums[nums.length-1] - nums[0];
        for(int i=0;i<nums.length-(k-1);i++){
            System.out.println(nums[i+k-1] + "  " + nums[i]);
            if(nums[i+k-1]-nums[i] < min)
                min = nums[i+k-1]-nums[i];
        }
        return min;
    }
}