class Solution {
    public boolean wordPattern(String pattern, String s) {
        String words[] = s.split(" ");
        HashMap<String,String> oneway = new HashMap<String,String>();
        HashMap<String,String> otherway = new HashMap<String,String>();

        if(pattern.length() != words.length){
            return false;
        }
        
        for(int i=0;i<pattern.length(); i++){
            if(!oneway.containsKey(pattern.charAt(i)+"") && !otherway.containsKey(words[i])){
                oneway.put(pattern.charAt(i)+"", words[i]);
                otherway.put(words[i],pattern.charAt(i)+"");
            }else{
                if(oneway.containsKey(pattern.charAt(i)+"")){
                    if(!oneway.get(pattern.charAt(i)+"").equals(words[i])){
                        return false;
                    }
                }else if(otherway.containsKey(words[i])){
                    if(!otherway.get(words[i]).equals(pattern.charAt(i)+"")){
                        return false;
                    }
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}