class Solution {
    public boolean isSubsequence(String s, String t) {
        int si = 0;
        int ti = 0;
        while(ti < t.length()){
            if(si >= s.length()){
                break;
            }
            if(s.charAt(si) == t.charAt(ti)){
                si+= 1;
                ti+= 1;
            } else{
                ti += 1;
            }
        }
        if(si == s.length()){
            return true;
        }
        return false;
    }
}