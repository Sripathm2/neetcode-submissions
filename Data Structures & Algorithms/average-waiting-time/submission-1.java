class Solution {
    public double averageWaitingTime(int[][] customers) {
        double chef_time = 0;
        double wait_time = 0;
        // System.out.println(customers.length + "  ");
        for(int i=0;i<customers.length;i++){
            if(chef_time <= customers[i][0]){
                wait_time += customers[i][1];
                chef_time = customers[i][0] + customers[i][1];
            }else{
                wait_time += (chef_time + customers[i][1]) - customers[i][0];
                chef_time += customers[i][1];
            }
            // System.out.println(chef_time + "  " + wait_time);
        }
        return wait_time/customers.length;
    }
}