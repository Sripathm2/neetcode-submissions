class Solution {
    public boolean isIsomorphic(String s, String t) {
        Hashtable<Character, Character> key = new Hashtable<Character, Character>();
        Hashtable<Character, Character> otherkey = new Hashtable<Character, Character>();

        for(int i = 0;i < s.length();i++){
            if(!key.containsKey(s.charAt(i))){
                // System.out.println("here");
                key.put(s.charAt(i), t.charAt(i));
                if(otherkey.containsKey(t.charAt(i))){
                    return false;
                }
                otherkey.put(t.charAt(i), s.charAt(i));
            }else if(key.get(s.charAt(i)) != t.charAt(i)){
                return false;
            }
            // System.out.println(s.charAt(i) + "  " + key.get(s.charAt(i)));
        }
        return true;
    }
}