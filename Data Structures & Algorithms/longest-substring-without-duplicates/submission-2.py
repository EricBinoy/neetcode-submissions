class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        
        store = set()
        l,r = 0,1
        maxl = 0;

        for r in range(len(s)):
            while s[r] in store:
                store.remove(s[l])
                l+=1 
            store.add(s[r])
            maxl = max(maxl,r-l+1 )
        return maxl