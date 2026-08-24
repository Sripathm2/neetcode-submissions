class Solution {
    public void moveZeroes(int[] nums) {
        int i =0;
        while(i<nums.length){
            if(nums[i] == 0){
                int j = i+1;
                int index = -1;
                while(j<nums.length){
                    if(nums[j]==0)
                        j++;
                    else{
                        index = j;
                        break;
                    }
                }
                if(index == -1){
                    return;
                }else{
                    nums[i] = nums[index];
                    nums[index] = 0;
                }
            }
            i += 1;
        }
    }
}