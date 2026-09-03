class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int [] count = new int[1001];
        for(int num:arr1)
            count[num] += 1;
        int j = 0;
        for(int num:arr2){
            while(count[num]>0){
                arr1[j] = num;
                count[num] -= 1;
                j += 1;
            }
        }
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr1[j] = i;
                count[i] -= 1;
                j += 1;
            }
        }
        return arr1;
    }
}