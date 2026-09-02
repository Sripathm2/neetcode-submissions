class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stk = new Stack<Integer>();
        for(String op: operations){
            if(op.equals("+")){
                int one = stk.pop();
                int two = stk.pop();
                stk.push(two);
                stk.push(one);
                stk.push(one+two);
            }else if(op.equals("C")){
                stk.pop();
            }else if(op.equals("D")){
                int one = stk.pop();
                stk.push(one);
                stk.push(2*one);
            }else{
                stk.push(Integer.parseInt(op));
            }
        }
        int sum = 0;
        while(!stk.isEmpty()){
            sum+= stk.pop();
        }
        return sum;
    }
}