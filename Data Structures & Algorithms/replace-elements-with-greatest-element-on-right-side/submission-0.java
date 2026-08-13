class Solution {
    public int[] replaceElements(int[] arr) {
        int [] new_arr = new int[arr.length];
        int max = -1;
        for(int j = arr.length-1; j > -1; j--){
            int temp = arr[j];
            new_arr[j] = max;
            max = Math.max(temp,max);
        }
        return new_arr;
    }
}