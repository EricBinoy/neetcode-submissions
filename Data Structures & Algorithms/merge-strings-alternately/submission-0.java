class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1 = word1.length() , l2 = word2.length();
        int a=0,b=0;
        StringBuilder res = new StringBuilder();
        while(a<l1 || b<l2)
        {
            if(a<l1) res.append(word1.charAt(a++));
            if(b<l2) res.append(word2.charAt(b++));
        }
        return res.toString();
    }
}