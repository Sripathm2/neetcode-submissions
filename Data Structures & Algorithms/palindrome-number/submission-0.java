class Solution {
    public boolean isPalindrome(int x) {
        int x_copy = x;
        int new_x = 0;
        while(x>0){
            new_x *= 10;
            new_x += x%10;
            x = x/10;
        }
        if(x_copy == new_x)
            return true;
        else
            return false;
    }
}