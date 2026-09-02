class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count  = 0;
        int kid= 0;
        int cookie = 0;
        while(kid < g.length && cookie < s.length){
            if(g[kid] <= s[cookie]){
                count += 1;
                kid += 1;
                cookie += 1;
            }
            else{
                cookie += 1;
            }
        }
        return count;
    }
}