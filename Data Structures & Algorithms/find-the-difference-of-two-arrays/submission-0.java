class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        for(int num:nums1){
            set1.add(num);
        }
        for(int num:nums2){
            set2.add(num);
        }
        HashSet<Integer> result = new HashSet<>(set1);
        result.removeAll(set2);

        List<List<Integer>> returnList = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<>(result);
        returnList.add(list);

        result = new HashSet<>(set2);
        result.removeAll(set1);
        list = new ArrayList<>(result);
        returnList.add(list);
        return  returnList;
    }
}