class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // first we push nums1
        if(n ==0){
            return;
        }
        for(int i=m-1; i > -1; i--){
            nums1[i+n] = nums1[i];
            nums1[i] = 0;
        }
        int one_pointer = n;
        int two_pointer = 0;
        int arr_index = 0;
        

        while(two_pointer < nums2.length || one_pointer < nums1.length){
            if(one_pointer == nums1.length){
                nums1[arr_index] = nums2[two_pointer];
                two_pointer += 1;
                arr_index += 1;
            } else if(two_pointer == nums2.length){
                nums1[arr_index] = nums1[one_pointer];
                one_pointer += 1;
                arr_index += 1;
            }else if(nums2[two_pointer] < nums1[one_pointer]){
                nums1[arr_index] = nums2[two_pointer];
                two_pointer += 1;
                arr_index += 1;
            }else{
                nums1[arr_index] = nums1[one_pointer];
                one_pointer += 1;
                arr_index += 1;
            }
        }
        
    }
}