class Solution {
    public int pivotIndex(int[] nums) {
        int sumleft = 0;
        int sumright = 0;
        int []left = new int[nums.length];
        int []right = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            left[i] = sumleft;
            sumleft += nums[i];
            right[nums.length - i - 1] = sumright;
            sumright += nums[nums.length - i - 1];
        }

        for(int i = 0; i < nums.length; i++){
            if(left[i] == right[i]){
                return i;
            }

        }
        return -1;
    }
}