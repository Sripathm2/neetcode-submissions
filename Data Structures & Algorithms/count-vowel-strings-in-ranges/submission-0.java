class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int count[] = new int[words.length];
        int vc = 0;
        for(int i=0;i<words.length;i++){
            String word = words[i];
            char s = word.charAt(0);
            char e = word.charAt(word.length()-1);
            if((s == 'a' || s == 'e' || s == 'i' || s == 'o'|| s == 'u') &&
                (e == 'a' || e == 'e' || e == 'i' || e == 'o'|| e == 'u')){
                    vc += 1;
                }
            count[i] = vc;
            System.out.println(vc);
        }
        int [] ret = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            if (queries[i][0] == 0) {
                ret[i] = count[queries[i][1]];
            } else {
                ret[i] = count[queries[i][1]] - count[queries[i][0] - 1];
            }
        }
        return ret;
    }
}