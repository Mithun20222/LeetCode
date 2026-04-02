class Solution {
    public int reverse(int x) {
        int temp=0;
        int x1=x;
        if(x<0)
        {
            x=x*-1;
        }
        while(x>0)
        {
            if(temp>2147483647/10)
            {
                return 0;
            }
            temp=x%10+temp*10;
            x=x/10;
        }
        if(x1<0)
        {
            temp=temp*-1;
        }
        if(temp>2147483647)
        {
            return 0;
        }
        return temp;
    }
}