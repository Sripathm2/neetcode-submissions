class Solution {
    public int numIdenticalPairs(int[] nums) {
        int [] count = new int [101];
        for(int num:nums){
            count[num] += 1;
        }
        int counter = 0;
        for(int i=0;i<count.length;i++){
            if(count[i]>1){
                counter += count[i]*(count[i]-1)/2;
            }

        }

        return counter;
    }
}