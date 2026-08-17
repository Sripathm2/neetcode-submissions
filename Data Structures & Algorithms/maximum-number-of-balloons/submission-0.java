class Solution {
    public int maxNumberOfBalloons(String text) {
        float counts[] = new float[5];
        for(int i=0;i<text.length();i++){
            if(text.charAt(i) == 'b'){
                counts[0] += 1;
            }else if(text.charAt(i) == 'a'){
                counts[1] += 1;
            }else if(text.charAt(i) == 'l'){
                counts[2] += 0.5;
            }
            else if(text.charAt(i) == 'o'){
                counts[3] += 0.5;
            }
            else if(text.charAt(i) == 'n'){
                counts[4] += 1;
            }
        }

        float minval = text.length();
        for(int i=0;i<counts.length;i++){
            if(minval > counts[i]){
                minval = counts[i];
            }
        }
        return (int)minval;
    }
}