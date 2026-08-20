class Solution {
    public boolean check(int[] nums) {
        boolean switched = false;
        int pivot_point  = -1;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] > nums[i+1]){
                if(switched){
                    return false;
                }else{
                    switched = true;
                    pivot_point = i;
                }
            }
        }

        for(int i = 0; i <= pivot_point; i++){
            for(int j = pivot_point+1; j < nums.length; j++){
                if(nums[i]<nums[j]){
                    System.out.println(i + "  " + j);
                    return false;
                }
            }

        }



        return true;
    }
}