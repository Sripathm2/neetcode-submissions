class Solution {
    public int removeElement(int[] nums, int val) {
        int j = 0;
        int [] copy = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]!= val){
                copy[j] = nums[i];
                j++;
            }
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=copy[i];
        }
        return j;
    }
}