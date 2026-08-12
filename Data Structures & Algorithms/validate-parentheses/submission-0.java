class Solution {
    public boolean isValid(String s) {
        Stack<Integer> stck = new Stack<Integer>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                stck.push(1);
            }else if(s.charAt(i) == '{'){
                stck.push(2);
            }else if(s.charAt(i) == '['){
                stck.push(3);
            }else if(s.charAt(i) == ')'){
                if(stck.isEmpty()){
                    return false;
                }else if(stck.pop() != 1){
                    return false;
                }
            }else if(s.charAt(i) == '}'){
                if(stck.isEmpty()){
                    return false;
                }else if(stck.pop() != 2){
                    return false;
                }
            }else if(s.charAt(i) == ']'){
                if(stck.isEmpty()){
                    return false;
                }else if(stck.pop() != 3){
                    return false;
                }
            }
        }
        if(!stck.isEmpty()){
            return false;
        }
        return true;
    }
}
