class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int values[] = new int[nums1.length];
        for(int i = 0;i<nums1.length;i++){
            int index = -1;
            boolean crossed = false;
            for(int j=0;j<nums2.length;j++){
                if(nums2[j] == nums1[i] && crossed== false)
                    crossed = true;
                else if(crossed && nums2[j] > nums1[i]){
                    index = nums2[j];
                    break;
                }
            }
            values[i] = index;
        }
        return values;
    }
}