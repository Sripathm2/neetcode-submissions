class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int size = asteroids.length;
        while(true){
            int poof = 0;
            for(int i=0;i<asteroids.length-1;i++){
                if(asteroids[i] > 0 && asteroids[i+1] < 0){
                    if(asteroids[i] * -1 == asteroids[i+1]){
                        poof += 2;
                        asteroids[i] = -1001;
                        asteroids[i+1] = -1001;
                        i += 2;
                    }else if(Math.abs(asteroids[i]) > Math.abs(asteroids[i+1])){
                        poof += 1;
                        asteroids[i+1] = -1001;
                        i += 2;
                    }else{
                        poof += 1;
                        asteroids[i] = -1001;
                        i += 1;
                    }
                    
                }
            }
            if(poof == 0){
                return asteroids;
            }
            else{
                int [] tmp = new int[asteroids.length-poof];
                int j=0;
                for(int i=0;i<asteroids.length;i++){
                    if(asteroids[i] != -1001){
                        tmp[j] = asteroids[i];
                        j++;
                    }
                }
                asteroids = tmp;
            }
        }
    }
}