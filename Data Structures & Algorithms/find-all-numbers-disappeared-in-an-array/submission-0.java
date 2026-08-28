class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missing = new ArrayList<Integer>();
        for(int i =0;i<nums.length;i++){
            int index = nums[i];
            if(index < 0){
                index *= -1;
            }
            if(index-1 < nums.length && nums[index-1] > 0){
                nums[index-1] *= -1;
            }
        }
        
        for(int i=0;i<nums.length;i++){
            // System.out.println(nums[i]);
            if(nums[i]>0){
                missing.add(i+1);
            }
        }
        return missing;
    }
}