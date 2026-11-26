class Solution:
    def isPalindrome(self, s: str) -> bool:

        # s = "".join(ch.lower() for ch in s if ch.isalnum())

        ns = ""

        for ch in s:
            if ch.isalnum():
                ns += ch.lower()
        s = ns
        
        i = 0
        j = len(s) - 1

        for i in range(len(s)):

            if i >= j:
                break

            if s[i] == s[j]:
                j -= 1

            else:
                return False

        return True