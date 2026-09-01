class Solution {
    public int minOperations(String s) {
        char [] arr = s.toCharArray();
        char prev = '2';
        int min_cnt = 0;
        for(int i=0;i<arr.length;i++){
            if(prev == arr[i]){
                if(arr[i] == '0')
                    arr[i] = '1';
                else
                    arr[i] = '0';
                min_cnt += 1;
            }
            prev = arr[i];
        }
        int another_min = 1;
        prev = '2';
        arr = s.toCharArray();
        if(arr[0] == '0')
            arr[0] = '1';
        else
            arr[0] = '0';
        for(int i=0;i<arr.length;i++){
            if(prev == arr[i]){
                if(arr[i] == '0')
                    arr[i] = '1';
                else
                    arr[i] = '0';
                another_min += 1;
            }
            prev = arr[i];
        }
        if(another_min< min_cnt)
            return another_min;
        else
            return min_cnt;

    }
}