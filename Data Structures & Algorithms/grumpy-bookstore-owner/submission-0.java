class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int count  = 0;
        for(int i=0;i<customers.length;i++){
            if(grumpy[i] == 0)
                count += customers[i];
        }
        int max_count = count;

        for(int i=0;i<customers.length;i++){
            if(grumpy[i] == 1){
                int temp = count;
                for(int j=i; j < customers.length && j-i < minutes; j++){
                    if(grumpy[j] == 1){
                        temp += customers[j];
                    }
                }
                if(temp > max_count){
                    max_count = temp;
                }
            }

        }
        return max_count;
    }
}