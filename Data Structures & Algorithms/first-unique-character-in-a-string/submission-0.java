class Solution {
    public int firstUniqChar(String s) {
        int [] count = new int[26];
        for(int i =0;i< count.length;i++){
            count[i] = -2;
        }

        for(int i=0;i< s.length();i++){
            if(count[s.charAt(i)-'a'] == -2)
                count[s.charAt(i)-'a'] = i;
            else
                count[s.charAt(i)-'a'] = -1;
        }


        int min_val = s.length();
        for(int i =0;i< count.length;i++){
            if(count[i]< min_val && count[i] >-1){
                min_val = count[i];
            }
        }

        if(min_val == s.length()){
            return -1;
        }
        return min_val;
    }
}