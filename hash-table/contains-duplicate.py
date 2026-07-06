class Solution(object):
    def containsDuplicate(self, nums):
        d = {}
        for i in nums:
            if(i not in d):
                d[i]=1
            else:
                if(d[i]==1):
                    return True
        return False