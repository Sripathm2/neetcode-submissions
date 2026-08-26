class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> matched = new ArrayList<String>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(i!=j && words[j].indexOf(words[i])!= -1 && !matched.contains(words[i])){
                    matched.add(words[i]);
                }
            }
        }
        return matched;
    }
}