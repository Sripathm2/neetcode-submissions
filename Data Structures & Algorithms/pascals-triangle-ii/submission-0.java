class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> return_list = new ArrayList<List<Integer>>();
        for(int i=0; i<=rowIndex;i++){
            List<Integer> temp = new ArrayList<Integer>();
            temp.add(1);
            if(i!=0){
                List<Integer> above = return_list.get(i-1);
                for(int j=0;j < above.size()-1; j++){
                    temp.add(above.get(j)+above.get(j+1));
                }
                temp.add(1);
            }
            return_list.add(temp);
        }
        return return_list.get(rowIndex);
    }
}