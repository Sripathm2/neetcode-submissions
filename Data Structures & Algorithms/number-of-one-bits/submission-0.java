class Solution {
    public int hammingWeight(int n) {
        int one_count = 0;
        for(int i=0;i<32;i++){
            if(((1 << i) & n) != 0){
                one_count += 1;
            }
        }
        return one_count;
    }
}
