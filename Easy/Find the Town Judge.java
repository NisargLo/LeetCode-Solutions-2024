class Solution {
    public int findJudge(int n, int[][] trust) {
        boolean f = false;
        int a;
        for (int i = 0; i < trust.length; i++) {
            a = trust[i][1];
            for (int j = 0; j < 2; j++) {
                if (a == trust[i][0]) {
                    break;
                } else {
                    f = true;
                }
            }
        }
        return a;
    }
}