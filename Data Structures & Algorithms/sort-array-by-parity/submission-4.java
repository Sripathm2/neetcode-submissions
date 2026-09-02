class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            while(left < nums.length && nums[left]%2 == 0)
                left += 1;
            while(right > -1 && nums[right]%2!=0)
                right -= 1;
            if(left < right){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left += 1;
                right -= 1;
            }
        }
        return nums;
    }
}