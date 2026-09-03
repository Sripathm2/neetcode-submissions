class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min = blocks.length();
        for(int i=0;i<=blocks.length()-k;i++){
            int w = 0;
            String sub = blocks.substring(i,i+k);
            for(int j =0;j<sub.length();j++){
                if(sub.charAt(j) == 'W')
                    w += 1;
            }
            if(min > w)
                min = w;
        }
        return min;
    }
}