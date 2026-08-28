class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ret = new ArrayList<List<String>>();
        HashMap<String, String> match = new HashMap<String, String>();
        for(String str:strs){
            int counts[] = new int[26];
            for(int i=0;i<str.length();i++){
                counts[str.charAt(i)-'a'] += 1;
            }
            if(str.length() == 0){
                str = " ";
            }
            String key = "";
            for(int count: counts){
                key += count + "-";
            }
            if(!match.containsKey(key)){
                match.put(key,str);
            }else{
                match.put(key,match.get(key)+","+str);
            }
        }


        for(String currentKey : match.keySet()) {
            String value = match.get(currentKey);
            String [] adds = value.split(",");
            List<String> temp = new ArrayList<String>();
            for(String add:adds){
                temp.add(add.replace(" ",""));
            }
            ret.add(temp);
        }

        return ret;

    }
}
