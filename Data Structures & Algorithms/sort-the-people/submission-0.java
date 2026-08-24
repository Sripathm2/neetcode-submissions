class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Hashtable<Integer, String> height_name = new Hashtable<Integer,String>();
        for(int i =0;i<names.length;i++){
            height_name.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        String [] sorted = new String[heights.length];
        for(int i = heights.length -1; i > -1; i--){
            sorted[heights.length-i-1] = height_name.get(heights[i]);
        }
        return sorted;
    }
}