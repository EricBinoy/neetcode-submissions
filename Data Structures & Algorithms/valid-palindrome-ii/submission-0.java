class Solution {
    public boolean validPalindrome(String s) {
        int l = s.length();
        int i = 0;

        while (i < l) 
        {
            // ✅ fresh copy each time
            StringBuilder sb = new StringBuilder(s);
            sb.deleteCharAt(i);

            boolean value = check(sb.toString());

            if (value == true) 
            {
                return true;
            } 
            else 
            {
                i++;
            }
        }

        // if loop finishes, check original string as well
        if (check(s) == true) 
        {
            return true;
        } 
        else 
        {
            return false;
        }
    }

    public boolean check(String str) 
    {
        String reversed = new StringBuilder(str).reverse().toString();

        if (str.equals(reversed)) 
        {
            return true;
        } 
        else 
        {
            return false;
        }
    }
}
