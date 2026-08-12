class Solution {
    public boolean isAnagram(String s, String t) {
        int [] counter = new int[26];
        for(int i=0; i < s.length(); i++){
            counter[s.charAt(i)-97] += 1;
        }
        for(int i=0; i < t.length(); i++){
            counter[t.charAt(i)-97] -= 1;
        }
        
        for(int i=0; i < counter.length; i++){
            if(counter[i]!= 0){
                return false;
            }
        }

        return true;
    }
}
