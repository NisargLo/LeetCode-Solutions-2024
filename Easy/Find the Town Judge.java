class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] cnt = new int[n + 1];
        for (int i = 0; i < trust.length; i++) {
            cnt[trust[i][1]]++;
        }
        int res = -1;
        for (int i = 1; i <= n; i++) {
            if (cnt[i] == (n - 1)) {
                res = i;
                break;
            }
        }
        for (int i = 0; i < trust.length; i++) {
            if (trust[i][0] == res) {
                return -1;
            }
        }
        return res;
    }
}