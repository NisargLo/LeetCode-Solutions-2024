class Solution {
    public String reverseVowels(String s) {
        char[] w = s.toCharArray();
        int st = 0;
        int e = s.length() - 1;
        String v = "aeiouAEIOU";
        while (st < e) {
            while (st < e && v.indexOf(w[st]) == -1) {
                st++;
            }
            while (st < e && v.indexOf(w[e]) == -1) {
                e--;
            }
            char temp = w[st];
            w[st] = w[e];
            w[e] = temp;
            st++;
            e--;
        }
        return new String(w);
    }
}