class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n < 0){
            return false;
        }
        String s = Integer.toBinaryString(n);
        int one_count  = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '1'){
                one_count += 1;
            }
        }
        return one_count == 1;
    }
}