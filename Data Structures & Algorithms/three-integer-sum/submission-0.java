class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        HashSet<String> pairs = new HashSet<String>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int j = i+1;
            int k = nums.length - 1;
            int target = -1*nums[i];
            while(j < k){
                if(nums[j]+nums[k] == target){
                    String temp = nums[i] + "=" + nums[j] + "=" + nums[k];
                    pairs.add(temp);
                    j+= 1;
                }else if(nums[j]+nums[k] < target){
                    j += 1;
                }else{
                    k -= 1;
                }
            }
        }

        for(String trip:pairs){
            String[] nu = trip.split("=");
            List<Integer> temp = new ArrayList<Integer>();
            temp.add(Integer.parseInt(nu[0]));
            temp.add(Integer.parseInt(nu[1]));
            temp.add(Integer.parseInt(nu[2]));
            ret.add(temp);
        }


        return ret;
    }
}