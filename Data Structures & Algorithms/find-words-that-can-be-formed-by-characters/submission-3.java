class Solution {
    public int countCharacters(String[] words, String chars) {
        int sum = 0;
        int [] count = new int[200];
        for(int i=0;i<chars.length();i++){
            count[chars.charAt(i)] +=1;
        }
        for(String word:words){
            int [] count1 = new int[200];
            for(int i=0;i<word.length();i++){
                System.out.println(word + "   " + word.charAt(i));
                count1[word.charAt(i)] +=1;
            }
            boolean add = true;
            for(int i=0;i<count1.length;i++){
                if(count1[i] > count[i])
                    add = false;
            }
            if(add)
                sum += word.length();
        }
        return sum;
    }
}