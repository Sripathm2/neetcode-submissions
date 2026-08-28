class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> count = new HashMap<String,Integer>();
        for(String s:arr){
            if(!count.containsKey(s)){
                count.put(s,1);
            }else{
                count.put(s,count.get(s) + 1);
            }
        }
        int index = 0;
        while(index < arr.length){
            if(count.get(arr[index]) == 1){
                k -= 1;
            }
            if(k == 0){
                return arr[index];
            }
            index += 1;
        }
        return "";
    }
}