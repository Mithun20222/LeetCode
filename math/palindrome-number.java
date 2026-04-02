class Solution {
    public boolean isPalindrome(int x) {
        int temp=0;
        int n=0;
        temp=x;
        while(x>0)
        {
            n=x%10+n*10;
            x=x/10;
        }
        if(temp==n)
            return true;
        else
            return false;
    }
}