class Solution {
    public int maxArea(int[] heights) {
        int max_water = 0;
        int i=0;
        int j = heights.length-1;
        while(i < j){
            int water = (j-i)*Math.min(heights[i],heights[j]);
            if(water > max_water){
                max_water = water;
            }
            if(heights[i] < heights[j])
                i += 1;
            else
                j -= 1;
        }
        return max_water;
    }
}
