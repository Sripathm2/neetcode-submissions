class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> val = new ArrayList<Integer>();
        int carry = 1;
        for(int i=digits.length-1; i > -1; i--){
            int sum = digits[i] + carry;
            if(sum ==10){
                val.add(0,0);
                carry = 1;
            }else{
                val.add(0,sum);
                carry = 0;
            }
        }
        if(carry == 1){
            val.add(0,1);
        }
        return val.stream().mapToInt(i -> i).toArray();
    }
}
