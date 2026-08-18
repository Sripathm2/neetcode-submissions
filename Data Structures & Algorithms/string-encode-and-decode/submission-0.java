class Solution {

    public String encode(List<String> strs) {
        String encode_str = "";
        for(String s: strs){
            encode_str += s.length() + "#" + s;
        }
        return encode_str;
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<String>();
        while(str.length() > 0){
            // System.out.println(str);
            int cut_index = str.indexOf('#');
            int length_val = Integer.parseInt(str.substring(0,cut_index));
            decoded.add(str.substring(cut_index+1,cut_index+1+length_val));
            str = str.substring(cut_index+1+length_val);
        }
        return decoded;
    }
}
