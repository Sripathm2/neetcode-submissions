class Solution {
    public boolean isPathCrossing(String path) {
        String loc = "(0,0)";
        int i = 0;
        int j = 0;
        for(int step =0;step<path.length();step++){
            if(path.charAt(step) == 'N'){
                i -= 1;
            }else if(path.charAt(step) == 'S'){
                i += 1;
            }else if(path.charAt(step) == 'E'){
                j += 1;
            }else if(path.charAt(step) == 'W'){
                j -= 1;
            }
            String newloc = "(" + i + "," + j + ")";
            if(loc.indexOf(newloc)!= -1){
                return true;
            }
            loc += newloc;
        }
        return false;
    }
}