class Solution {
    public int secondHighest(String s) {
        StringBuilder sb = new StringBuilder();
        for (short i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9' && sb.indexOf(s.charAt(i) + "") < 0) {
                sb.append(s.charAt(i));
            }
        }
        char[] c = (sb + "").toCharArray();
        Arrays.sort(c);
        return c.length >= 2 ? Integer.parseInt(c[c.length - 2] + "") : -1;
    }
}