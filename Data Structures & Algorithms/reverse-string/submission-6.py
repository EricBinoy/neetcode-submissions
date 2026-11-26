class Solution:
    def reverseString(self, s: List[str]) -> None:
        """
        Do not return anything, modify s in-place instead.
        """
        i = 0
        j = len(s) - 1

        for i in range(len(s)):
            if i<j:
                temp = s[i]
                s[i] = s[j]
                s[j] = temp

                i += 1
                j -= 1
        
        return s

            

        