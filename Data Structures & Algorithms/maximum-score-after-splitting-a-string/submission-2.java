class Solution {
    public int maxScore(String s) {
        char [] arr = s.toCharArray();
        int o_cnt = 0;
        int z_cnt = 0;
        for(char i: arr){
            if(i =='0')
                z_cnt += 1;
            else
                o_cnt += 1;
        }

        int z_cnt_new = 0;
        int max_score = 0;
        for(char i: arr){
            if(i =='0')
                z_cnt_new += 1;
            else
                o_cnt -= 1;

            if(max_score<z_cnt_new+o_cnt && (o_cnt > 0 || z_cnt>z_cnt_new))
                max_score=z_cnt_new+o_cnt;
        }
        return max_score;
    }
}