class Solution {
    public int countPrimes(int n) {
        boolean[] a = new boolean[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            a[i]=true;
        }
        for(int i=2;i<Math.sqrt(n);i++)
        {
            if(a[i]==true)
            {
                for(int j=i*i;j<n;j+=i)
                {
                    a[j]=false;
                }
            }
        }
        for(int i=2;i<n;i++)
        {
            if(a[i]==true)
            {
                c++;
            }
        }
        return c;
    }
}