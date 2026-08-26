class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean ac[] = new boolean[26]; 
        for(int i=0;i<allowed.length();i++){
            ac[allowed.charAt(i)-'a'] = true;
        }
        int bad = 0;
        for(String s:words){
            for(int j=0;j<s.length();j++){
                if(!ac[s.charAt(j)-'a']){
                    bad += 1;
                    break;
                }
            }
        }
        return words.length - bad;
    }
}