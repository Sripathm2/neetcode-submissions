class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> ret = new ArrayList<String>();
        String temp = words[0];
        int word_count = 1;
        for(int i=1;i<words.length;i++){
            if(temp.length() + 1+ words[i].length() > maxWidth){
                
                // three cases no space , left allinged , middle
                if(temp.length() == maxWidth){
                    ret.add(temp);
                }else if(word_count == 1){
                    temp += String.format("%" + (maxWidth - temp.length()) + "s", "");
                    ret.add(temp); 
                }else{
                    // figure out how many space to add 
                    int word_length  = (maxWidth - (temp.length() - (word_count-1)));
                    int spaces_needed = word_length / (word_count-1);
                    int remainder = word_length%(word_count-1);
                    String [] temps_words = temp.split(" ");
                    temp = "";
                    for(String wo: temps_words){
                        if(spaces_needed != 0)
                            temp += wo + String.format("%" + (spaces_needed) + "s", "");
                        else
                            temp += wo + " ";
                        if(remainder > 0){
                            temp += " ";
                            remainder -= 1;
                        }
                    }
                    temp = temp.substring(0,maxWidth);
                    ret.add(temp);
                }
                temp = words[i];
                word_count = 1;
            }else{
                temp += " " + words[i];
                word_count += 1;
            }
        }
        ret.add(temp + " ".repeat(maxWidth - temp.length()));
        return ret;
    }
}