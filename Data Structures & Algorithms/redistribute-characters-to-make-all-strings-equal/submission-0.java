class Solution {
    public boolean makeEqual(String[] words) {
        int count[] = new int[26];
        for(String word: words){
            char [] temp = word.toCharArray();
            for(char let: temp){
                count[let-'a'] += 1;
            }
        }
        for(int num: count){
            if(num%words.length != 0){
                return false;
            }
        }

        return true;
    }
}