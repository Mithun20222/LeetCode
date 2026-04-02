class Solution {
    int sum_of_dig(int n) {
        int temp = 0;
        while (n > 0) {
            temp += n % 10;
            n /= 10;
        }
        return temp;
    }
    public int maximumSum(int[] nums) {
        int maxsum = -1;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for( int num:nums)
        {
            if(hm.containsKey(sum_of_dig(num)))
            {
                maxsum = Math.max(maxsum,num+hm.get(sum_of_dig(num)));
                hm.put(sum_of_dig(num), Math.max(num, hm.get(sum_of_dig(num))));
            }
            else
            {
                hm.put(sum_of_dig(num),num);
            }
        }
        return maxsum;
    }
}
