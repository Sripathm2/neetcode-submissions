class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length;
        int mid  = -1;

        while(low <= high){
            mid = (low + high)/2;

            System.out.println(mid);

            if(mid < 0 || mid >= nums.length){
                break;
            }

            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }
}
