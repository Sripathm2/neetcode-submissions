class NumArray {

    public int [] arr;
    public int n = 0;

    public NumArray(int[] nums) {
        this.n = nums.length+1;
        this.arr = new int[n];
        for(int index = 0;index < nums.length; index++){
            this.arr[index+1] = nums[index];
        }
        for(int index = 0;index < this.n; index++){
            if(index + this.LSB(index) < this.n){
                this.arr[index + this.LSB(index)] += this.arr[index];
            }
        }
    }

    private int LSB(int i){
        return i & (-i);
    }

    private int sum_part(int n) {
        int sum = 0;
        n += 1;
        while(n>0){
            sum+= this.arr[n];
            n -= this.LSB(n);
        }
        return sum;
    }
    
    public int sumRange(int left, int right) {
        if(left ==0){
            return this.sum_part(right);
        }
        return this.sum_part(right) - this.sum_part(left-1);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */