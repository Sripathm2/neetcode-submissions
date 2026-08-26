class Solution {
    public String longestCommonPrefix(String[] strs) {
        int max_index = strs[0].length();
        for(int i=0;i<strs.length-1;i++){
            int j = 0;
            while(j < strs[i].length() && j < strs[i+1].length()){
                if(strs[i].charAt(j) == strs[i+1].charAt(j))
                    j += 1;
                else
                    break;
            }
            if(j < max_index){
                max_index = j;
            }
        }
        return strs[0].substring(0,max_index);
    }
}