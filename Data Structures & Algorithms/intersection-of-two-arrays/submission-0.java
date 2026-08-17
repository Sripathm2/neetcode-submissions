class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<Integer>();
        Set<Integer> s2 = new HashSet<Integer>();
        for(int num:nums1){
            s1.add(num);
        }
        for(int num:nums2){
            s2.add(num);
        }
        Set<Integer> intersect = new HashSet<Integer>(s1);
        intersect.retainAll(s2);
        return intersect.stream().mapToInt(Number::intValue).toArray();
    }
}