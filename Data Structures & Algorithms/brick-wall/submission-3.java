class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        int sum = 0;
        for(int wid:wall.get(0)){
            sum += wid;
        }

        HashMap<Integer,Integer> count = new HashMap<Integer,Integer>();

        for(List<Integer> row:wall){
            int pos = 0;
            for(int j = 0;j<row.size()-1;j++){
                pos += row.get(j);
                count.put(pos, count.getOrDefault(pos, 0) + 1);
            }
        }
        int max = 0;
        
        for(int num:count.values()){
            if(max < num){
                max = num;
            }
        }


        return wall.size() - max;

    }
}