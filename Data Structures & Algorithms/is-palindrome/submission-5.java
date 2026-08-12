class Solution {
    public boolean isPalindrome(String s) {
        int leftptr = 0;
        int rightptr = s.length() - 1;
        int atleast_one_letter = 0;

        s = s.toLowerCase();

        while(leftptr <rightptr){
            while(leftptr<s.length()){
                if((s.charAt(leftptr) >= 97 && s.charAt(leftptr) <= 122) ||
                    s.charAt(leftptr) >= 48 && s.charAt(leftptr) <= 57){
                    break;
                }else{
                    leftptr += 1;
                }
            }
            while(rightptr > -1){
                if((s.charAt(rightptr) >= 97 && s.charAt(rightptr) <= 122) ||
                    s.charAt(rightptr) >= 48 && s.charAt(rightptr) <= 57){
                    break;
                }else{
                    rightptr -= 1;
                }
            }

            if(leftptr >= s.length() || rightptr < 0 || s.charAt(leftptr) != s.charAt(rightptr)){
                if(atleast_one_letter==0 && leftptr >= s.length() && rightptr < 0){
                    return true;
                }
                return false;
            }else{
                leftptr += 1;
                rightptr -= 1;
                atleast_one_letter += 1;
            }
        }

        return true;
    }
}
