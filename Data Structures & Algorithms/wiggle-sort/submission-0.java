class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int [] copy = new int[nums.length];
        for(int i=0;i<copy.length;i++){
            copy[i] = nums[i];
        }
        int i =0;
        int j=copy.length-1;
        int choose = 0; 
        for(int k = 0; k < nums.length;k++){
            if(choose == 0){
                nums[k] = copy[i];
                choose = 1;
                i += 1;
            }else{
                nums[k] = copy[j];
                choose = 0;
                j -= 1;
            }
        }
    }
}
