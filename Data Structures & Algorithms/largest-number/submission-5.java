class Solution {
    public String largestNumber(int[] nums) {
        String [] arr = new String[nums.length];
        for(int i=0;i<arr.length;i++){
            arr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        String return_val = "";
        boolean add_once = false;
        for(int i = 0;i<arr.length;i++){
            if(i==0 && arr[i].equals("0")){
                return_val = "0";
                break;
            }
            else
                return_val += arr[i];
        }
        // long value = Long.parseLong(return_val);
        return return_val;
    }
}