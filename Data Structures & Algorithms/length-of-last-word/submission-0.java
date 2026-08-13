class Solution {
    public int lengthOfLastWord(String s) {
        String s_arr[] = s. split(" ");
        int return_val = -1;
        for(int i = s_arr.length-1; i >-1; i--){
            if(s_arr[i].length()>0){
                return s_arr[i].length();
            }
        }
        return -1;
    }
}