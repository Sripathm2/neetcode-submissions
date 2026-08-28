class Solution {
    public int maxDifference(String s) {
        int count[] = new int[26];
        int min_even = s.length();
        int max_odd = 0;
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a'] += 1;
        }
        Arrays.sort(count);
        for(int val:count){
            if(val%2==0 && val<min_even && val!=0)
                min_even = val;
            if(val%2==1 && val>max_odd)
                max_odd = val;
        }
        return max_odd - min_even;
    }
}