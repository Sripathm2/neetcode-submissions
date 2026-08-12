class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<Integer>();
        int sum = -1;
        int nvalue = n;
        while(true){
            sum = summaker(nvalue);
            if(set.contains(sum)){
                return false;
            }else{
                set.add(sum);
                nvalue = sum;
            }if(sum == 1){
                return true;
            }
        }
        
    }
    

    public int summaker(int n){
        int sum =0;
        int n_copy = n;
        while(n_copy>0){
            sum += (n_copy%10)*(n_copy%10);
            n_copy /= 10;
        }
        return sum;
    }
}
