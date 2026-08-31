class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int [] n = new int[grid.length*grid.length];
        int repeated = -1;
        int xor_val = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                int num = i*grid.length+j+1;
                xor_val  = xor_val^num;
                if(n[grid[i][j]-1] == -1){
                    repeated = grid[i][j];
                }else{
                    n[grid[i][j]-1] = -1;
                    xor_val  = xor_val^grid[i][j];
                }
            }
        }
        return new int[]{repeated, xor_val};
    }
}