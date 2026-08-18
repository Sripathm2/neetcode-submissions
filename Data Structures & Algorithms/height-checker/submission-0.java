class Solution {
    public int heightChecker(int[] heights) {
        int [] heights_copy = new int [heights.length];  
        for(int i = 0;i<heights.length;i++){
            heights_copy[i] = heights[i];
        }
        Arrays.sort(heights_copy);
        int mismtach = 0;
        for(int i = 0;i<heights.length;i++){
            if(heights_copy[i]!= heights[i]){
                mismtach+= 1;
            }
        }
        return mismtach;

    }
}