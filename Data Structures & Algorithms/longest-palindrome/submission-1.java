class Solution {
    public int longestPalindrome(String s) {
        int count[] = new int[130];

        for(int i =0;i<s.length();i++){
            count[s.charAt(i)] += 1;
        }
        int word_length = 0;
        int one_od = 0;
        for(int i =0;i<count.length;i++){
            if(count[i]/2 > 0){
                word_length += count[i]/2 * 2;
                count[i] = count[i]%2==0? 0:1;
            }
            if(count[i]>0){
                one_od = 1;
            }
        }
        word_length += one_od;
        return word_length;

    }
}