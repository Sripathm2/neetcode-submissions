class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> values = new HashSet<Integer>();
        for(int num:nums){
            values.add(num);
        }
        int longest = 0;
        for(int num:nums){
            if(values.contains(num-1))
                continue;
            else{
                int temp =0;
                int val = num;
                while(true){
                    if(values.contains(val)){
                        temp += 1;
                        val += 1;
                    }else{
                        break;
                    }
                }
                if(temp > longest){
                    longest=temp;
                }
            }
        }
        return longest;
    }
}
