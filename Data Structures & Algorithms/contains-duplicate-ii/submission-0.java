class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Hashtable<Integer,Integer> tab = new Hashtable<Integer,Integer>();

        for(int i=0;i<nums.length;i++){
            if(tab.containsKey(nums[i]))
                if(Math.abs(tab.get(nums[i])-i) <= k)
                    return true;
            tab.put(nums[i],i);
        }

        return false;
    }
}