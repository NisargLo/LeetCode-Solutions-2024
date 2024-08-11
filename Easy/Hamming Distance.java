class Solution {
    public int hammingDistance(int x, int y) {
        byte c = 0;
        int no = x ^ y;
        while (no != 0) {
            c += (no & 1);
            no = no >> 1;
        }
        return c;
    }
}