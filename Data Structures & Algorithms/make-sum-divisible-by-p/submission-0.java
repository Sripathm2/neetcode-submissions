class Solution {
    public int minSubarray(int[] nums, int p) {
        int max = nums.length;
        int sum = 0;
        for(int n:nums){
            sum += n;
        }
        if(sum%p==0){
            return 0;
        }

        for(int i=0;i<nums.length;i++){
            int cnt = 0;
            int sumcopy = sum;
            for(int j=i;j<nums.length;j++){
                cnt +=1;
                sumcopy -= nums[j];
                if(sumcopy % p ==0){
                    if(max > cnt)
                        max = cnt;
                    break;
                }
            } 
        }

        
        if(max == nums.length){
            return -1;
        }
        return max;
    }
}