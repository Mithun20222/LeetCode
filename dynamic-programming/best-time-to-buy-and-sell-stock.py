class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        mnp = float('inf')
        mxp = 0
        for p in prices:
            if p<mnp:
                mnp = p
            else:
                mxp = max(mxp,p-mnp)
        return mxp