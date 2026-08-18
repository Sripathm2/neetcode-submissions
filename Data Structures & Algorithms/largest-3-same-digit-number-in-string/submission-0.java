class Solution {
    public String largestGoodInteger(String num) {
        String return_str = "";
        char check = '+';

        char []chars = num.toCharArray();

        for(int i=0;i<chars.length-2;i++){
            if(chars[i] == chars[i+1] && chars[i+1] == chars[i+2]){
                if(check < chars[i]){
                    check = chars[i];
                    return_str = chars[i] + "" + chars[i] +""+ chars[i];
                }
            }
        }



        return return_str;
    }
}