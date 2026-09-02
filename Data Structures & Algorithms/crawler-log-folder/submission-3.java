class Solution {
    public int minOperations(String[] logs) {
        int count = 0;
        for(String log:logs){
            if(log.equals("./"))
                continue;
            else if(log.equals("../") && count != 0)
                count -= 1;
            else if(!log.equals("../"))
                count += 1;
        }
        return count;
    }
}